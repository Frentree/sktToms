package com.frentree.toms.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.frentree.pimc.database.ibatis.vo.tomsVo;
import com.frentree.tomsjob.TmanJobs;
import com.frentree.tomsjob.TomsJobs;
import com.iopts.scheduler.queue.QueueStaticPool;
import com.skyun.app.util.config.AppConfig;

public class tomsMain {
	private static BlockingQueue<tomsVo> queue = null;
	public static String currentDir = null;
	private static String LOGJ_PATH = null;
	
	public static void main(String[] args) {
		
		currentDir = System.getProperty("user.dir");
		File f = new File(currentDir);
		currentDir = f.getParent().toString();
		
		LOGJ_PATH = currentDir + "/conf/logbackTmanUpdate.xml";
		System.setProperty("logback.configurationFile", LOGJ_PATH);
		
		Logger logger = LoggerFactory.getLogger(tomsMain.class);
		
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		AppConfig.setPID(getPID() + "");
		wrtiePID(AppConfig.getPID());
		
		
		logger.info(">> Process ID :" + AppConfig.getPID());
		logger.info(">> Home Dir :" + AppConfig.currentDir);
		logger.info(">> System Version  2024-01-18");
		logger.info(">> 1. Toms Update");
        logger.info(">> 2. Target User Table Change");
		
		queue = new QueueStaticPool().getJobQueue();
		
		// TomsJobs toms = new TomsJobs();
		TmanJobs tman = new TmanJobs(); 
	}
	
	public static long getPID() {
		String processName = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
		return Long.parseLong(processName.split("@")[0]);
	}
	
	public static void wrtiePID(String pid) {
		BufferedWriter out=null;
		 try {
		      out = new BufferedWriter(new FileWriter(AppConfig.currentDir+"/tomspid"));

		      out.write(pid); 
		    } catch (IOException e) {
		        System.err.println(e); 
		        System.exit(1);
		    } finally {
		    	try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
	}
}
