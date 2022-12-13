package com.frentree.tomsjob;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BlockingQueue;

import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import com.frentree.pimc.database.ibatis.vo.tomsVo;
import com.frentree.toms.vo.tomsCo;
import com.google.gson.Gson;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.iopts.scheduler.queue.QueueStaticPool;
import com.skyun.recon.util.database.ibatis.SqlMapInstance;
import com.skyun.recon.util.database.ibatis.tr.DBInsertTable;

public class TomsJobs {
	private DBInsertTable tr = null;
	Logger logger = LoggerFactory.getLogger(TomsJobs.class);
	private static BlockingQueue<tomsVo> queue = null;
	private static SqlMapClient sqlMap = null;

	public TomsJobs() {
		this.sqlMap = SqlMapInstance.getSqlMapInstance();
		tr = new DBInsertTable();
		this.queue = new QueueStaticPool().getJobQueue();
		
		tomsData();
	}
	
	public void tomsData() {
		int page = 1;
		
		while(true) {
			//String curlurl = String.format("http://tiams.sktelecom.com/app/if/api/S304070/1.0/list.json?rows=100&page=%d",page);
			String curlurl = String.format("http://tiams.sktelecom.com/app/if/api/S302080/1.0/list.json?rows=100&page=%d",page);
			
			logger.info("url [" + curlurl + "]");

			//String[] array = curlurl.split(" ");
			// HttpResponse response = curl(curlurl);
			
			String json_string;
			try {
				// json_string = EntityUtils.toString(response.getEntity());
				
				HttpClient client = HttpClientBuilder.create().build(); // HttpClient 생성
				HttpGet getRequest = new HttpGet(curlurl); //GET 메소드 URL 생성

				HttpResponse response = client.execute(getRequest);

				//Response 출력
				if (response.getStatusLine().getStatusCode() == 200) {
					ResponseHandler<String> handler = new BasicResponseHandler();
					String body = handler.handleResponse(response);
					JSONObject obj1 = new JSONObject(body);
					int tomsPage = obj1.getInt("totalPage");
					logger.info("Toms Get Page List >>>>>>>>>>>>>>> " + page);
					logger.info("Toms TotalPage List >>>>>>>>>>>>>>> " + tomsPage);
					if(page > tomsPage) {
						return;
					} else {
						JSONArray temp1 = obj1.getJSONArray("dataSets");

						for (int i = 0; i < temp1.length(); i++) {
							Gson gson = new Gson();
							tomsCo g = gson.fromJson(temp1.get(i).toString(), tomsCo.class);
							tomsAll(g);
						}
						logger.info("Toms Page : " + page + " Success >>>>>>>>>>>>>>> " + tomsPage);
					}
				} else {
					logger.error("response is error : " + response.getStatusLine().getStatusCode());
					
					return;
				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}
			page++;
			
		}

	}


	private String getDate(String s) {

		Timestamp timestamp = new Timestamp(Long.parseLong(s) * 1000);
		Date date = new Date(timestamp.getTime());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
		return simpleDateFormat.format(timestamp);

	}

	private void tomsAll(tomsCo g) {
		tomsVo v = new tomsVo();
		v.setValue(g);

		tr.setDBInsertTable("insert.setToms", v);

		//

		if (g == null) {
			logger.info("TomsAll Data is null ____");
			return;
		}
	}


}
