package com.skyun.recon.util.database.ibatis.tr;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.frentree.pimc.database.ibatis.vo.ServerInfoVo;
import com.frentree.pimc.database.ibatis.vo.targetUserVo;
import com.frentree.pimc.database.ibatis.vo.tomsVo;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.skyun.recon.util.database.ibatis.SqlMapInstance;

//Database Insert 
public class DBInsertTable {
	Logger logger = LoggerFactory.getLogger(DBInsertTable.class);
	private static SqlMapClient sqlMap = null;

	private int ret = 0;
	private String sexception;

	public DBInsertTable() {
		this.sqlMap = SqlMapInstance.getSqlMapInstance();
	}

	public DBInsertTable(SqlMapClient sqlMap) {
		this.sqlMap = sqlMap;
	}

	public void setDBInsertTable(String trid, Object obj) {

		try {
			if (obj instanceof tomsVo) {
				this.sqlMap.openSession().insert(trid, (tomsVo) obj);
				ret = 1;
				sexception = "OK";
			}  else {
				logger.info("unknown data type " + obj.getClass().getName());
			}
			if (obj instanceof ServerInfoVo) {
				this.sqlMap.openSession().insert(trid, (ServerInfoVo) obj);
				ret = 1;
				sexception = "OK";
			}else if (obj instanceof targetUserVo) {
				this.sqlMap.openSession().insert(trid, (targetUserVo) obj);
				ret = 1;
				sexception = "OK";
			}
			else {
				logger.info("unknown data type " + obj.getClass().getName());
			}

		} catch (SQLException e) {
			sexception = e.getMessage();
			ret = -1;
			logger.info("DB Error :____________________" + sexception);
		}

	}

	public String getSexception() {
		return sexception;
	}

	public int getRet() {
		return ret;
	}
	
	public SqlMapClient getSqlclient() {
		return this.sqlMap;
	}

}
