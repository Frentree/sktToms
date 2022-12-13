package com.frentree.toms.vo;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PersonCo {
	@SerializedName("EmpNo")
	private String empNo;
	
	@SerializedName("EmpNm")
	private String empNm;

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
		return "PersonCo [empNo=" + empNo + ", empNm=" + empNm + "]";
	}

}
