package com.cg.employeemaintainence.exception;

public class EmployeemaintainenceException extends Exception {
	
	String message;
	
	public EmployeemaintainenceException (String message)
	{
		this.message =message;
		
	}
	@Override
	public String getMessage()
	{
		return this.message;
	}
	
	

}
