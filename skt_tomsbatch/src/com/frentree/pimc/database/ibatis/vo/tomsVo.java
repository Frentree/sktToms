package com.frentree.pimc.database.ibatis.vo;

import com.frentree.toms.vo.tomsCo;

public class tomsVo {
	//IT자산관리번호
	private String assetNoSch;
	//내부 IT자산관리번호
	private String assetNo;
	//구it자산관리번호
	private String assetNoOld;
	//구성관리번호
	private String confNo;
	//자산상태코드
	private String assetStatCd;
	//자산상태
	private String assetStatNm;
	//제품명
	private String modelNm;
	//제조사
	private String svcDomainNo;
	//서비스군 번호
	private String svcDomainNm;
	//서비스군
	private String svcNo;
	//서비스명
	private String svcNm;
	//운영부서 ID
	private String opDeptId;
	//운영부서
	private String opDeptNm;
	//사업부서 ID
	private String bizDeptId;
	//사업부터
	private String bizDeptNm;
	//BP인프라운영자 ID
	private String bpInfraUserId;
	//BP인프라운영자
	private String bpInfraUserNm;
	//BP APP운영자 ID
	private String bpAppUserId;
	//BP인프라운영자
	private String bpAppUserNm;
	//SKT인프라운영자 ID
	private String sktInfraUserId;
	//SKT인프라운영자
	private String sktInfraUserNm;
	// 23.01.20 추가
	private String sktAppUserId;
	// 23.01.20 추가
	private String sktAppUserNm;
	//ERO_NO(자산관리번호)
	private String erpNo;
	//ERP_NO취득일자
	private String erpAcqSdt;
	//대표 IP주소
	private String mainIpAddr;
	//HostName
	private String hostNm;
	//자산IT분류체계(대) 코드
	private String divLCd;
	//자산IT분류체계(대)
	private String divLNm;
	//자산IT분류체계(중) 코드
	private String divMCd;
	//자산IT분류체계(중)
	private String divMNm;
	//자산IT분류체계(소) 코드
	private String divSCd;
	//자산IT분류체계(소)
	private String divSNm;
	//구성시스템코드
	private String srcTypeCd;
	//구성시스템
	private String srcTypeNm;
	//os명
	private String osNm;
	//os버전
	private String osVer;
	
	private String target_id;
	
	public String getAssetNoSch() {
		return assetNoSch;
	}
	public void setAssetNoSch(String assetNoSch) {
		this.assetNoSch = assetNoSch;
	}
	public String getAssetNo() {
		return assetNo;
	}
	public void setAssetNo(String assetNo) {
		this.assetNo = assetNo;
	}
	public String getAssetNoOld() {
		return assetNoOld;
	}
	public void setAssetNoOld(String assetNoOld) {
		this.assetNoOld = assetNoOld;
	}
	public String getConfNo() {
		return confNo;
	}
	public void setConfNo(String confNo) {
		this.confNo = confNo;
	}
	public String getAssetStatCd() {
		return assetStatCd;
	}
	public void setAssetStatCd(String assetStatCd) {
		this.assetStatCd = assetStatCd;
	}
	public String getAssetStatNm() {
		return assetStatNm;
	}
	public void setAssetStatNm(String assetStatNm) {
		this.assetStatNm = assetStatNm;
	}
	public String getModelNm() {
		return modelNm;
	}
	public void setModelNm(String modelNm) {
		this.modelNm = modelNm;
	}
	public String getSvcDomainNo() {
		return svcDomainNo;
	}
	public void setSvcDomainNo(String svcDomainNo) {
		this.svcDomainNo = svcDomainNo;
	}
	public String getSvcDomainNm() {
		return svcDomainNm;
	}
	public void setSvcDomainNm(String svcDomainNm) {
		this.svcDomainNm = svcDomainNm;
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
	public String getOpDeptId() {
		return opDeptId;
	}
	public void setOpDeptId(String opDeptId) {
		this.opDeptId = opDeptId;
	}
	public String getOpDeptNm() {
		return opDeptNm;
	}
	public void setOpDeptNm(String opDeptNm) {
		this.opDeptNm = opDeptNm;
	}
	public String getBizDeptId() {
		return bizDeptId;
	}
	public void setBizDeptId(String bizDeptId) {
		this.bizDeptId = bizDeptId;
	}
	public String getBizDeptNm() {
		return bizDeptNm;
	}
	public void setBizDeptNm(String bizDeptNm) {
		this.bizDeptNm = bizDeptNm;
	}
	public String getBpInfraUserId() {
		return bpInfraUserId;
	}
	public void setBpInfraUserId(String bpInfraUserId) {
		this.bpInfraUserId = bpInfraUserId;
	}
	public String getBpInfraUserNm() {
		return bpInfraUserNm;
	}
	public void setBpInfraUserNm(String bpInfraUserNm) {
		this.bpInfraUserNm = bpInfraUserNm;
	}
	public String getSktInfraUserId() {
		return sktInfraUserId;
	}
	public void setSktInfraUserId(String sktInfraUserId) {
		this.sktInfraUserId = sktInfraUserId;
	}
	public String getSktInfraUserNm() {
		return sktInfraUserNm;
	}
	public void setSktInfraUserNm(String sktInfraUserNm) {
		this.sktInfraUserNm = sktInfraUserNm;
	}
	public String getErpNo() {
		return erpNo;
	}
	public void setErpNo(String erpNo) {
		this.erpNo = erpNo;
	}
	public String getErpAcqSdt() {
		return erpAcqSdt;
	}
	public void setErpAcqSdt(String erpAcqSdt) {
		this.erpAcqSdt = erpAcqSdt;
	}
	public String getMainIpAddr() {
		return mainIpAddr;
	}
	public void setMainIpAddr(String mainIpAddr) {
		this.mainIpAddr = mainIpAddr;
	}
	public String getHostNm() {
		return hostNm;
	}
	public void setHostNm(String hostNm) {
		this.hostNm = hostNm;
	}
	public String getDivLCd() {
		return divLCd;
	}
	public void setDivLCd(String divLCd) {
		this.divLCd = divLCd;
	}
	public String getDivLNm() {
		return divLNm;
	}
	public void setDivLNm(String divLNm) {
		this.divLNm = divLNm;
	}
	public String getDivMCd() {
		return divMCd;
	}
	public void setDivMCd(String divMCd) {
		this.divMCd = divMCd;
	}
	public String getDivMNm() {
		return divMNm;
	}
	public void setDivMNm(String divMNm) {
		this.divMNm = divMNm;
	}
	public String getDivSCd() {
		return divSCd;
	}
	public void setDivSCd(String divSCd) {
		this.divSCd = divSCd;
	}
	public String getDivSNm() {
		return divSNm;
	}
	public void setDivSNm(String divSNm) {
		this.divSNm = divSNm;
	}
	
	public String getBpAppUserId() {
		return bpAppUserId;
	}
	public void setBpAppUserId(String bpAppUserId) {
		this.bpAppUserId = bpAppUserId;
	}
	public String getBpAppUserNm() {
		return bpAppUserNm;
	}
	public void setBpAppUserNm(String bpAppUserNm) {
		this.bpAppUserNm = bpAppUserNm;
	}
	public String getSrcTypeCd() {
		return srcTypeCd;
	}
	public void setSrcTypeCd(String srcTypeCd) {
		this.srcTypeCd = srcTypeCd;
	}
	public String getSrcTypeNm() {
		return srcTypeNm;
	}
	public void setSrcTypeNm(String srcTypeNm) {
		this.srcTypeNm = srcTypeNm;
	}

	public String getOsNm() {
		return osNm;
	}
	public void setOsNm(String osNm) {
		this.osNm = osNm;
	}
	public String getOsVer() {
		return osVer;
	}
	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}
	public String getTarget_id() {
		return target_id;
	}
	public void setTarget_id(String target_id) {
		this.target_id = target_id;
	}
	public String getSktAppUserId() {
		return sktAppUserId;
	}
	public void setSktAppUserId(String sktAppUserId) {
		this.sktAppUserId = sktAppUserId;
	}
	public String getSktAppUserNm() {
		return sktAppUserNm;
	}
	public void setSktAppUserNm(String sktAppUserNm) {
		this.sktAppUserNm = sktAppUserNm;
	}
	
	public void setValue(tomsCo t) {
		this.assetNoSch = t.getAssetNoSch();
		this.assetNo = t.getAssetNo();
		this.assetNoOld = t.getAssetNoOld();
		this.confNo = t.getConfNo();
		this.assetStatCd = t.getAssetStatCd();
		this.assetStatNm = t.getAssetStatNm();
		this.modelNm = t.getModelNm();
		this.svcDomainNo = t.getSvcDomainNo();
		this.svcDomainNm = t.getSvcDomainNm();
		this.svcNo = t.getSvcNo();
		this.svcNm = t.getSvcNm();
		this.opDeptId = t.getOpDeptId();
		this.opDeptNm = t.getOpDeptNm();
		this.bizDeptId = t.getBizDeptId();
		this.bizDeptNm = t.getBizDeptNm();
		this.bpAppUserId = t.getBizDeptId();
		this.bpAppUserNm = t.getBizDeptNm();
		this.bpInfraUserId = t.getBpInfraUserId();
		this.bpInfraUserNm = t.getBpInfraUserNm();
		this.sktInfraUserId = t.getSktInfraUserId();
		this.sktInfraUserNm = t.getSktInfraUserNm();
		this.sktAppUserId = t.getSktAppUserId();
		this.sktAppUserNm = t.getSktAppUserNm();
		this.erpNo = t.getErpNo();
		this.erpAcqSdt = t.getErpAcqSdt();
		this.mainIpAddr = t.getMainIpAddr();
		this.hostNm = t.getHostNm();
		this.divLCd = t.getDivLCd();
		this.divLNm = t.getDivLNm();
		this.divMCd = t.getDivMCd();
		this.divMNm = t.getDivMNm();
		this.divSCd = t.getDivSCd();
		this.divSNm = t.getDivSNm();
		this.srcTypeCd = t.getSrcTypeCd();
		this.srcTypeNm = t.getSrcTypeNm();
		this.osNm = t.getOsNm();
		this.osVer = t.getOsVer();
	}

}
