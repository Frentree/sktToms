package com.frentree.tomsjob;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.frentree.pimc.database.ibatis.vo.ServerInfoVo;
import com.frentree.pimc.database.ibatis.vo.TmanVo;
import com.frentree.pimc.database.ibatis.vo.targetUserVo;
import com.frentree.pimc.database.ibatis.vo.tomsVo;
import com.frentree.toms.vo.ServerInfoCo;
import com.frentree.toms.vo.TmanCo;
import com.google.gson.Gson;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.iopts.scheduler.queue.QueueStaticPool;
import com.skyun.app.util.config.AppConfig;
import com.skyun.app.util.config.IoptsCurl;
import com.skyun.recon.util.database.ibatis.SqlMapInstance;
import com.skyun.recon.util.database.ibatis.tr.DBInsertTable;

public class TmanJobs {
	private DBInsertTable tr = null;
	Logger logger = LoggerFactory.getLogger(TmanJobs.class);
	private static BlockingQueue<tomsVo> queue = null;
	private static SqlMapClient sqlMap = null;

	public TmanJobs() {
		this.sqlMap = SqlMapInstance.getSqlMapInstance();
		tr = new DBInsertTable();
		this.queue = new QueueStaticPool().getJobQueue();
		
		tmanData();
	}
	
	public void tmanData() {
		String url = AppConfig.getProperty("config.tman.url");
		String key = AppConfig.getProperty("config.tman.key");
		String curlurl = String.format(url);
		
		logger.info("url [" + curlurl + "]");
		String[] array = curlurl.split(" ");
		String json_string = new IoptsCurl().opt(array).header("Content-Type: application/json").header("Tman-AUTH:"+key).exec(null);
		
		try {
			Gson gson = new Gson();

			TmanCo tmanCo = gson.fromJson(json_string, TmanCo.class);
			TmanVo tmanVo = new TmanVo(tmanCo);
			// 데이터 값이 잘 갖고 오면
			if(tmanVo.getSuccessCode().toUpperCase().equals("SUCCESS")) {
				
				logger.info("tmanVo.getServerInfo().size() >>>>> " + tmanVo.getServerInfo().size());
				
				for (int i = 0; i < tmanVo.getServerInfo().size(); i++) {
					tmanAll(tmanVo.getServerInfo().get(i));
				}
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}


	private String getDate(String s) {

		Timestamp timestamp = new Timestamp(Long.parseLong(s) * 1000);
		Date date = new Date(timestamp.getTime());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		return simpleDateFormat.format(timestamp);

	}

	private void tmanAll(ServerInfoCo g) {
		/*tomsVo v = new tomsVo();
		v.setValue(g);*/
		
		ServerInfoVo v = new ServerInfoVo(g);
		List<targetUserVo> stList;
		try {
			// 조회
			List<tomsVo> tList = this.sqlMap.queryForList("query.selectTmanIp", v);
			
			if(tList.size() < 1) {
				// 삽입(Insert)
				logger.info("insert_data >>>> " + v.toString());
				tr.setDBInsertTable("insert.setTman", v);
			} else {
				// 업데이트(Update)
				logger.info("update_data >>>> " + v.toString());
				tr.setDBInsertTable("update.setTmanUpdate", v);
			}
			
			stList = this.sqlMap.queryForList("query.selectTmanManager");
			
			for(targetUserVo stVo : stList) {
				
				targetUserVo vo = new targetUserVo();
				
				String service_nm = stVo.getSvcNm();
				String user_no = stVo.getBpInfraUserId();
				String service_user = stVo.getBpAppUserId(); 
				String infra_manager = stVo.getSktInfraUserId();
				
				if(service_nm!=null && !service_nm.equals("")) {
					vo.setSvcNm(service_nm);
					vo.setTarget_id(stVo.getTarget_id());
					tr.setDBInsertTable("update.setTargetUserServiceNm", vo);
				}
				
				if(user_no!=null && !user_no.equals("")) {
					vo.setBpInfraUserId(user_no);
					vo.setTarget_id(stVo.getTarget_id());
					tr.setDBInsertTable("update.setTargetUserBpInfra", vo);
				}
				
				if(service_user!=null && !service_user.equals("")) {
					vo.setBpAppUserId(service_user);
					vo.setTarget_id(stVo.getTarget_id());
					tr.setDBInsertTable("update.setTargetUserBpApp", vo);
				}
				
				if(infra_manager!=null && !infra_manager.equals("")) {
					vo.setSktInfraUserId(infra_manager);
					vo.setTarget_id(stVo.getTarget_id());
					tr.setDBInsertTable("update.setTargetUserSKTInfra", vo);
				}
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if (g == null) {
			logger.info("TomsAll Data is null ____");
			return;
		}
	}


}
