package com.frentree.toms.vo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class TmanCo {
	@SerializedName("SuccessCode")
	private String successCode;
	
	@SerializedName("ErrMsg")
	private String errMsg;
	
	@SerializedName("ServerInfo")
	private List<ServerInfoCo> serverInfo;

	public String getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(String successCode) {
		this.successCode = successCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<ServerInfoCo> getServerInfo() {
		return serverInfo;
	}

	public void setServerInfo(List<ServerInfoCo> serverInfo) {
		this.serverInfo = serverInfo;
	}

	@Override
	public String toString() {
		return "tmanCo [successCode=" + successCode + ", errMsg=" + errMsg + ", serverInfo=" + serverInfo + "]";
	}

	
}
