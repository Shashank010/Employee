package com.cg.employeemaintainence.dao;

import com.cg.employeemaintainence.dto.EmployeeMaintainence;
import com.cg.employeemaintainence.exception.EmployeemaintainenceException;

public interface EmployeemaintainenceDao {
	EmployeeMaintainence adminlogin()throws EmployeemaintainenceException; 
	EmployeeMaintainence userlogin()throws EmployeemaintainenceException;
}
