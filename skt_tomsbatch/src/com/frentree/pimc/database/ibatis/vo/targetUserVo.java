package com.frentree.pimc.database.ibatis.vo;

public class targetUserVo {
	private String target_id = "";
	private int ap_no;
	private String hostNm = "";
	private String ip = "";
	private String svcNo = "";
	private String svcNm = "";
	private String user_no = "";
	private String bpInfraUserId = "";
	private String bpAppUserId = "";
	private String sktInfraUserId = "";
	private String sktAppUserId = "";
	private int userFlag;
	private String changeFlag = "";
	
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public int getAp_no() {
		return ap_no;
	}
	public void setAp_no(int ap_no) {
		this.ap_no = ap_no;
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
	public String getSvcNo() {
		return svcNo;
	}
	public void setSvcNo(String svcNo) {
		this.svcNo = svcNo;
	}
	public String getSvcNm() {
		return svcNm;
	}
	public void setSvcNm(String svcNm) {
		this.svcNm = svcNm;
	}
	public String getUser_no() {
		return user_no;
	}
	public void setUser_no(String user_no) {
		this.user_no = user_no;
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
	public String getSktAppUserId() {
		return sktAppUserId;
	}
	public void setSktAppUserId(String sktAppUserId) {
		this.sktAppUserId = sktAppUserId;
	}
	public int getUserFlag() {
		return userFlag;
	}
	public void setUserFlag(int userFlag) {
		this.userFlag = userFlag;
	}
	public String getChangeFlag() {
		return changeFlag;
	}
	public void setChangeFlag(String changeFlag) {
		this.changeFlag = changeFlag;
	}
	@Override
	public String toString() {
		return "targetUserVo [target_id=" + target_id + ", ap_no=" + ap_no + ", hostNm=" + hostNm + ", ip=" + ip
				+ ", svcNo=" + svcNo + ", svcNm=" + svcNm + ", user_no=" + user_no + ", bpInfraUserId=" + bpInfraUserId
				+ ", bpAppUserId=" + bpAppUserId + ", sktInfraUserId=" + sktInfraUserId + ", sktAppUserId="
				+ sktAppUserId + ", userFlag=" + userFlag + ", changeFlag=" + changeFlag + "]";
	}
	
}
