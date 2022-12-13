package com.frentree.toms.vo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ServerInfoCo {
	@SerializedName("CiNo")
	private String ciNo;
	
	@SerializedName("HwStatCode")
	private String hwStatCode;
	
	@SerializedName("HwStatName")
	private String hwStatName;
	
	@SerializedName("InfraType")
	private String infraType;
	
	@SerializedName("Ip")
	private String ip;
	
	@SerializedName("SvcL1Code")
	private String svcL1Code;
	
	@SerializedName("SvcL1Name")
	private String svcL1Name;
	
	@SerializedName("SvcL2Code")
	private String svcL2Code;
	
	@SerializedName("SvcL2Name")
	private String svcL2Name;
	
	@SerializedName("VendorName")
	private String vendorName;
	
	@SerializedName("ModelName")
	private String modelName;
	
	@SerializedName("BsnsPerson")
	private List<PersonCo> bsnsPerson;
	
	@SerializedName("DevPerson")
	private List<PersonCo> devPerson;
	
	@SerializedName("InfraPerson")
	private List<PersonCo> infraPerson;
	
	@SerializedName("HostName")
	private String hostName;
	
	@SerializedName("OsVer")
	private String osVer;

	public String getCiNo() {
		return ciNo;
	}

	public void setCiNo(String ciNo) {
		this.ciNo = ciNo;
	}

	public String getHwStatCode() {
		return hwStatCode;
	}

	public void setHwStatCode(String hwStatCode) {
		this.hwStatCode = hwStatCode;
	}

	public String getHwStatName() {
		return hwStatName;
	}

	public void setHwStatName(String hwStatName) {
		this.hwStatName = hwStatName;
	}

	public String getInfraType() {
		return infraType;
	}

	public void setInfraType(String infraType) {
		this.infraType = infraType;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getSvcL1Code() {
		return svcL1Code;
	}

	public void setSvcL1Code(String svcL1Code) {
		this.svcL1Code = svcL1Code;
	}

	public String getSvcL1Name() {
		return svcL1Name;
	}

	public void setSvcL1Name(String svcL1Name) {
		this.svcL1Name = svcL1Name;
	}

	public String getSvcL2Code() {
		return svcL2Code;
	}

	public void setSvcL2Code(String svcL2Code) {
		this.svcL2Code = svcL2Code;
	}

	public String getSvcL2Name() {
		return svcL2Name;
	}

	public void setSvcL2Name(String svcL2Name) {
		this.svcL2Name = svcL2Name;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public List<PersonCo> getBsnsPerson() {
		return bsnsPerson;
	}

	public void setBsnsPerson(List<PersonCo> bsnsPerson) {
		this.bsnsPerson = bsnsPerson;
	}

	public List<PersonCo> getDevPerson() {
		return devPerson;
	}

	public void setDevPerson(List<PersonCo> devPerson) {
		this.devPerson = devPerson;
	}

	public List<PersonCo> getInfraPerson() {
		return infraPerson;
	}

	public void setInfraPerson(List<PersonCo> infraPerson) {
		this.infraPerson = infraPerson;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getOsVer() {
		return osVer;
	}

	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}

	@Override
	public String toString() {
		return "ServerInfoCo [ciNo=" + ciNo + ", hwStatCode=" + hwStatCode + ", hwStatName=" + hwStatName
				+ ", infraType=" + infraType + ", ip=" + ip + ", svcL1Code=" + svcL1Code + ", svcL1Name=" + svcL1Name
				+ ", svcL2Code=" + svcL2Code + ", svcL2Name=" + svcL2Name + ", vendorName=" + vendorName
				+ ", modelName=" + modelName + ", bsnsPerson=" + bsnsPerson + ", devPerson=" + devPerson
				+ ", infraPerson=" + infraPerson + ", hostName=" + hostName + ", osVer=" + osVer + "]";
	}

}
