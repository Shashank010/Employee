package com.cg.employeemaintainence.service;

import com.cg.employeemaintainence.dto.EmployeeMaintainence;
import com.cg.employeemaintainence.exception.EmployeemaintainenceException;

public interface EmployeemaintainenceService {
	
	EmployeeMaintainence adminlogin()throws EmployeemaintainenceException; 
	EmployeeMaintainence userlogin()throws EmployeemaintainenceException;

}
