package com.iopts.scheduler.queue;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.frentree.pimc.database.ibatis.vo.tomsVo;
import com.skyun.app.util.config.AppConfig;

public class QueueStaticPool {

	static BlockingQueue<tomsVo> JobQueue = null;
	static HashMap<String,String> exception_hash = null;

	static {
		JobQueue = new ArrayBlockingQueue<tomsVo>(AppConfig.getPropertyInt("config.queue.size"));
		exception_hash=new HashMap<>();
	}

	public BlockingQueue<tomsVo> getJobQueue() {
		return JobQueue;
	}

	public void setJobQueue(BlockingQueue<tomsVo> jobQueue) {
		JobQueue = jobQueue;
	}

	public static HashMap<String, String> getException_hash() {
		return exception_hash;
	}

	public static void setException_hash(HashMap<String, String> h) {
		exception_hash.clear();
		exception_hash = h;
	}
	

}
