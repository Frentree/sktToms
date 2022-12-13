package com.frentree.pimc.database.ibatis.vo;

import java.util.List;

import com.frentree.toms.vo.PersonCo;
import com.frentree.toms.vo.ServerInfoCo;

public class ServerInfoVo {
	private String CiNo = "";
	private String HwStatCode = "";
	private String HwStatName = "";
	private String InfraType = "";
	private String Ip = "";
	private String SvcL1Code = "";
	private String SvcL1Name = "";
	private String SvcL2Code = "";
	private String SvcL2Name = "";
	private String VendorName = "";
	private String ModelName = "";
	private String BsnsPersonEmpNo = "";
	private String BsnsPersonEmpNm = "";
	private String DevPersonEmpNo = "";
	private String DevPersonEmpNm = "";
	private String InfraPersonEmpNo = "";
	private String InfraPersonEmpNm = "";
	
	private List<PersonCo> BsnsPerson;
	private List<PersonCo> DevPerson;
	private List<PersonCo> InfraPerson;
	private String HostName = "";
	private String OsVer = "";
	
	public ServerInfoVo() {
		
	}
	
	public ServerInfoVo(ServerInfoCo i) {
		CiNo = i.getCiNo();
		HwStatCode = i.getHwStatCode();
		HwStatName = i.getHwStatName();
		InfraType = i.getInfraType();
		Ip = i.getIp();
		SvcL1Code = i.getSvcL1Code();
		SvcL1Name = i.getSvcL1Name();
		SvcL2Code = i.getSvcL2Code();
		SvcL2Name = i.getSvcL2Name();
		VendorName = i.getVendorName();
		ModelName = i.getModelName();
		HostName = i.getHostName();
		OsVer = i.getOsVer();
		if(i.getBsnsPerson() != null) {
			if(i.getBsnsPerson().size() > 0) { 
				BsnsPersonEmpNo = i.getBsnsPerson().get(0).getEmpNo();
				BsnsPersonEmpNm = i.getBsnsPerson().get(0).getEmpNm();
			}
		}
		if(i.getDevPerson() != null) {
			if(i.getDevPerson().size() > 0) { 
				DevPersonEmpNo = i.getDevPerson().get(0).getEmpNo();;
				DevPersonEmpNm = i.getDevPerson().get(0).getEmpNm();
			}
		}
		if(i.getInfraPerson() != null) {
			if(i.getInfraPerson().size() > 0) { 
				InfraPersonEmpNo = i.getInfraPerson().get(0).getEmpNo();
				InfraPersonEmpNm = i.getInfraPerson().get(0).getEmpNm();
			}
		}
		BsnsPerson = i.getBsnsPerson();
		DevPerson = i.getDevPerson();
		InfraPerson = i.getInfraPerson();
	}

	public String getCiNo() {
		return CiNo;
	}

	public void setCiNo(String ciNo) {
		CiNo = ciNo;
	}

	public String getHwStatCode() {
		return HwStatCode;
	}

	public void setHwStatCode(String hwStatCode) {
		HwStatCode = hwStatCode;
	}

	public String getHwStatName() {
		return HwStatName;
	}

	public void setHwStatName(String hwStatName) {
		HwStatName = hwStatName;
	}

	public String getInfraType() {
		return InfraType;
	}

	public void setInfraType(String infraType) {
		InfraType = infraType;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getSvcL1Code() {
		return SvcL1Code;
	}

	public void setSvcL1Code(String svcL1Code) {
		SvcL1Code = svcL1Code;
	}

	public String getSvcL1Name() {
		return SvcL1Name;
	}

	public void setSvcL1Name(String svcL1Name) {
		SvcL1Name = svcL1Name;
	}

	public String getSvcL2Code() {
		return SvcL2Code;
	}

	public void setSvcL2Code(String svcL2Code) {
		SvcL2Code = svcL2Code;
	}

	public String getSvcL2Name() {
		return SvcL2Name;
	}

	public void setSvcL2Name(String svcL2Name) {
		SvcL2Name = svcL2Name;
	}

	public String getVendorName() {
		return VendorName;
	}

	public void setVendorName(String vendorName) {
		VendorName = vendorName;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}
	
	public String getBsnsPersonEmpNo() {
		return BsnsPersonEmpNo;
	}

	public void setBsnsPersonEmpNo(String bsnsPersonEmpNo) {
		BsnsPersonEmpNo = bsnsPersonEmpNo;
	}

	public String getBsnsPersonEmpNm() {
		return BsnsPersonEmpNm;
	}

	public void setBsnsPersonEmpNm(String bsnsPersonEmpNm) {
		BsnsPersonEmpNm = bsnsPersonEmpNm;
	}

	public String getDevPersonEmpNo() {
		return DevPersonEmpNo;
	}

	public void setDevPersonEmpNo(String devPersonEmpNo) {
		DevPersonEmpNo = devPersonEmpNo;
	}

	public String getDevPersonEmpNm() {
		return DevPersonEmpNm;
	}

	public void setDevPersonEmpNm(String devPersonEmpNm) {
		DevPersonEmpNm = devPersonEmpNm;
	}

	public String getInfraPersonEmpNo() {
		return InfraPersonEmpNo;
	}

	public void setInfraPersonEmpNo(String infraPersonEmpNo) {
		InfraPersonEmpNo = infraPersonEmpNo;
	}

	public String getInfraPersonEmpNm() {
		return InfraPersonEmpNm;
	}

	public void setInfraPersonEmpNm(String infraPersonEmpNm) {
		InfraPersonEmpNm = infraPersonEmpNm;
	}

	public List<PersonCo> getBsnsPerson() {
		return BsnsPerson;
	}

	public void setBsnsPerson(List<PersonCo> bsnsPerson) {
		BsnsPerson = bsnsPerson;
	}

	public List<PersonCo> getDevPerson() {
		return DevPerson;
	}

	public void setDevPerson(List<PersonCo> devPerson) {
		DevPerson = devPerson;
	}

	public List<PersonCo> getInfraPerson() {
		return InfraPerson;
	}

	public void setInfraPerson(List<PersonCo> infraPerson) {
		InfraPerson = infraPerson;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public String getOsVer() {
		return OsVer;
	}

	public void setOsVer(String osVer) {
		OsVer = osVer;
	}

	@Override
	public String toString() {
		return "ServerInfoVo [CiNo=" + CiNo + ", HwStatCode=" + HwStatCode + ", HwStatName=" + HwStatName
				+ ", InfraType=" + InfraType + ", Ip=" + Ip + ", SvcL1Code=" + SvcL1Code + ", SvcL1Name=" + SvcL1Name
				+ ", SvcL2Code=" + SvcL2Code + ", SvcL2Name=" + SvcL2Name + ", VendorName=" + VendorName
				+ ", ModelName=" + ModelName + ", BsnsPersonEmpNo=" + BsnsPersonEmpNo + ", BsnsPersonEmpNm="
				+ BsnsPersonEmpNm + ", DevPersonEmpNo=" + DevPersonEmpNo + ", DevPersonEmpNm=" + DevPersonEmpNm
				+ ", InfraPersonEmpNo=" + InfraPersonEmpNo + ", InfraPersonEmpNm=" + InfraPersonEmpNm + ", BsnsPerson="
				+ BsnsPerson + ", DevPerson=" + DevPerson + ", InfraPerson=" + InfraPerson + ", HostName=" + HostName
				+ ", OsVer=" + OsVer + "]";
	}

	
}
