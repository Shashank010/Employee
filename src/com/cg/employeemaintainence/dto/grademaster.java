package com.cg.employeemaintainence.dto;

public class grademaster {
	
	String Grade_code;
	String Description;
	String Min_Salary;
	String Max_Salaray;
	public String getGrade_code() {
		return Grade_code;
	}
	public void setGrade_code(String grade_code) {
		Grade_code = grade_code;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getMin_Salary() {
		return Min_Salary;
	}
	public void setMin_Salary(String min_Salary) {
		Min_Salary = min_Salary;
	}
	public String getMax_Salaray() {
		return Max_Salaray;
	}
	public void setMax_Salaray(String max_Salaray) {
		Max_Salaray = max_Salaray;
	}
	public grademaster(String grade_code, String description,
			String min_Salary, String max_Salaray) {
		super();
		Grade_code = grade_code;
		Description = description;
		Min_Salary = min_Salary;
		Max_Salaray = max_Salaray;
	}
	@Override
	public String toString() {
		return "grademaster [Grade_code=" + Grade_code + ", Description="
				+ Description + ", Min_Salary=" + Min_Salary + ", Max_Salaray="
				+ Max_Salaray + "]";
	}
	
	public  grademaster()
	{
		
	}
	

}
