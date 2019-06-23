package com.cg.employeemaintainence.dto;

public class department {
	
	int Dept_ID;
	String Dept_Name;
	public int getDept_ID() {
		return Dept_ID;
	}
	public void setDept_ID(int dept_ID) {
		Dept_ID = dept_ID;
	}
	public String getDept_Name() {
		return Dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	@Override
	public String toString() {
		return "department [Dept_ID=" + Dept_ID + ", Dept_Name=" + Dept_Name
				+ "]";
	}
	public department(int dept_ID, String dept_Name) {
		super();
		Dept_ID = dept_ID;
		Dept_Name = dept_Name;
	}
	
	
	public  department()
	{
		
	}

}
