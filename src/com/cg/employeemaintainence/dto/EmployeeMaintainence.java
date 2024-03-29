package com.cg.employeemaintainence.dto;

import java.util.Date;

public class EmployeeMaintainence {
	
	String Emp_ID;
	String Emp_First_Name;
	String  Emp_Last_Name;
	Date Emp_Date_of_Birth;
	Date Emp_Date_of_Joining;
	int Emp_Dept_ID ;
	String Emp_Grade;
	String Emp_Designation;
	int Emp_Basic;
	String Emp_Gender;
	String Emp_Marital_Status;
	String Emp_Home_Address;
	String Emp_Contact_Num;
	public String getEmp_ID() {
		return Emp_ID;
	}
	public void setEmp_ID(String emp_ID) {
		Emp_ID = emp_ID;
	}
	public String getEmp_First_Name() {
		return Emp_First_Name;
	}
	public void setEmp_First_Name(String emp_First_Name) {
		Emp_First_Name = emp_First_Name;
	}
	public String getEmp_Last_Name() {
		return Emp_Last_Name;
	}
	public void setEmp_Last_Name(String emp_Last_Name) {
		Emp_Last_Name = emp_Last_Name;
	}
	public Date getEmp_Date_of_Birth() {
		return Emp_Date_of_Birth;
	}
	public void setEmp_Date_of_Birth(Date emp_Date_of_Birth) {
		Emp_Date_of_Birth = emp_Date_of_Birth;
	}
	public Date getEmp_Date_of_Joining() {
		return Emp_Date_of_Joining;
	}
	public void setEmp_Date_of_Joining(Date emp_Date_of_Joining) {
		Emp_Date_of_Joining = emp_Date_of_Joining;
	}
	public int getEmp_Dept_ID() {
		return Emp_Dept_ID;
	}
	public void setEmp_Dept_ID(int emp_Dept_ID) {
		Emp_Dept_ID = emp_Dept_ID;
	}
	public String getEmp_Grade() {
		return Emp_Grade;
	}
	public void setEmp_Grade(String emp_Grade) {
		Emp_Grade = emp_Grade;
	}
	public String getEmp_Designation() {
		return Emp_Designation;
	}
	public void setEmp_Designation(String emp_Designation) {
		Emp_Designation = emp_Designation;
	}
	public int getEmp_Basic() {
		return Emp_Basic;
	}
	public void setEmp_Basic(int emp_Basic) {
		Emp_Basic = emp_Basic;
	}
	public String getEmp_Gender() {
		return Emp_Gender;
	}
	public void setEmp_Gender(String emp_Gender) {
		Emp_Gender = emp_Gender;
	}
	public String getEmp_Marital_Status() {
		return Emp_Marital_Status;
	}
	public void setEmp_Marital_Status(String emp_Marital_Status) {
		Emp_Marital_Status = emp_Marital_Status;
	}
	public String getEmp_Home_Address() {
		return Emp_Home_Address;
	}
	public void setEmp_Home_Address(String emp_Home_Address) {
		Emp_Home_Address = emp_Home_Address;
	}
	public String getEmp_Contact_Num() {
		return Emp_Contact_Num;
	}
	public void setEmp_Contact_Num(String emp_Contact_Num) {
		Emp_Contact_Num = emp_Contact_Num;
	}
	@Override
	public String toString() {
		return "EmployeeMaintainence [Emp_ID=" + Emp_ID + ", Emp_First_Name="
				+ Emp_First_Name + ", Emp_Last_Name=" + Emp_Last_Name
				+ ", Emp_Date_of_Birth=" + Emp_Date_of_Birth
				+ ", Emp_Date_of_Joining=" + Emp_Date_of_Joining
				+ ", Emp_Dept_ID=" + Emp_Dept_ID + ", Emp_Grade=" + Emp_Grade
				+ ", Emp_Designation=" + Emp_Designation + ", Emp_Basic="
				+ Emp_Basic + ", Emp_Gender=" + Emp_Gender
				+ ", Emp_Marital_Status=" + Emp_Marital_Status
				+ ", Emp_Home_Address=" + Emp_Home_Address
				+ ", Emp_Contact_Num=" + Emp_Contact_Num + "]";
	}
	
	
	public EmployeeMaintainence(String emp_ID, String emp_First_Name,
			String emp_Last_Name, Date emp_Date_of_Birth,
			Date emp_Date_of_Joining, int emp_Dept_ID, String emp_Grade,
			String emp_Designation, int emp_Basic, String emp_Gender,
			String emp_Marital_Status, String emp_Home_Address,
			String emp_Contact_Num) {
		super();
		Emp_ID = emp_ID;
		Emp_First_Name = emp_First_Name;
		Emp_Last_Name = emp_Last_Name;
		Emp_Date_of_Birth = emp_Date_of_Birth;
		Emp_Date_of_Joining = emp_Date_of_Joining;
		Emp_Dept_ID = emp_Dept_ID;
		Emp_Grade = emp_Grade;
		Emp_Designation = emp_Designation;
		Emp_Basic = emp_Basic;
		Emp_Gender = emp_Gender;
		Emp_Marital_Status = emp_Marital_Status;
		Emp_Home_Address = emp_Home_Address;
		Emp_Contact_Num = emp_Contact_Num;
	}
	
	public  EmployeeMaintainence()
	{
		
	}
	
}
