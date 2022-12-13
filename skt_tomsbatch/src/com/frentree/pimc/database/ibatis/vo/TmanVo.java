package com.frentree.pimc.database.ibatis.vo;

import java.util.List;

import com.frentree.toms.vo.ServerInfoCo;
import com.frentree.toms.vo.TmanCo;

public class TmanVo {
	private String successCode = "";
	private String errmsg = "";
	private List<ServerInfoCo> serverInfo;
	
	public TmanVo() {
		
	}
	
	public TmanVo(TmanCo i) {
		successCode = i.getSuccessCode();
		errmsg = i.getErrMsg();
		serverInfo = i.getServerInfo();
	}

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public List<ServerInfoCo> getServerInfo() {
		return serverInfo;
	}

	public void setServerInfo(List<ServerInfoCo> serverInfo) {
		this.serverInfo = serverInfo;
	}

	@Override
	public String toString() {
		return "TmanVo [successCode=" + successCode + ", errmsg=" + errmsg + ", serverInfo=" + serverInfo + "]";
	}

}
