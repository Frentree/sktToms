package com.frentree.pimc.database.ibatis.vo;

public class targetUserVo {
	private String target_id = "";
	private String hostNm = "";
	private String ip = "";
	private String svcNm = "";
	private String bpInfraUserId = "";
	private String bpAppUserId = "";
	private String sktInfraUserId = "";
	
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public String getHostNm() {
		return hostNm;
	}
	public void setHostNm(String hostNm) {
		this.hostNm = hostNm;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getSvcNm() {
		return svcNm;
	}
	public void setSvcNm(String svcNm) {
		this.svcNm = svcNm;
	}
	public String getBpInfraUserId() {
		return bpInfraUserId;
	}
	public void setBpInfraUserId(String bpInfraUserId) {
		this.bpInfraUserId = bpInfraUserId;
	}
	public String getBpAppUserId() {
		return bpAppUserId;
	}
	public void setBpAppUserId(String bpAppUserId) {
		this.bpAppUserId = bpAppUserId;
	}
	public String getSktInfraUserId() {
		return sktInfraUserId;
	}
	public void setSktInfraUserId(String sktInfraUserId) {
		this.sktInfraUserId = sktInfraUserId;
	}
	
	@Override
	public String toString() {
		return "targetUserVo [target_id=" + target_id + ", hostNm=" + hostNm + ", ip=" + ip + ", svcNm=" + svcNm
				+ ", bpInfraUserId=" + bpInfraUserId + ", bpAppUserId=" + bpAppUserId + ", sktInfraUserId="
				+ sktInfraUserId + "]";
	}

}
