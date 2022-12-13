package com.frentree.pimc.database.ibatis.vo;

import com.frentree.toms.vo.PersonCo;

public class PersonVo {
	private String empNo = "";
	private String empNm = "";
	
	public PersonVo() {
		
	}
	
	public PersonVo(PersonCo i) {
		empNo = i.getEmpNo();
		empNm = i.getEmpNm();
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpNm() {
		return empNm;
	}

	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}

	@Override
	public String toString() {
		return "PersonVo [empNo=" + empNo + ", empNm=" + empNm + "]";
	}

}
