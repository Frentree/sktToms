package com.frentree.tomsjob;

import java.sql.SQLException;
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
		/*String url = AppConfig.getProperty("config.tman.url");
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
		}*/
		List<targetUserVo> stList;
		try {
			stList = this.sqlMap.queryForList("query.selectTmanManager");
			
			for(targetUserVo stVo : stList) {
				String chkFlag = (String) this.sqlMap.queryForObject("query.selectChangeFlag", stVo);
				
				if (chkFlag == null || "N".equals(chkFlag)) {
					tr.setDBInsertTable("insert.setTmanUpdate", stVo);
		        }
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}


	private String getDate(String s) {

		Timestamp timestamp = new Timestamp(Long.parseLong(s) * 1000);
		Date date = new Date(timestamp.getTime());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		return simpleDateFormat.format(timestamp);

	}


}
