package com.LoanManagement.springLoan.DTO;

public class LoanRepaymentSchedule {

	
	private String Date;
	
	private double EMI;
	
	private double Principle;
	private double Intrest_rate;
	private double Outstanding_amount;
	private String Status;
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public double getEMI() {
		return EMI;
	}
	public void setEMI(double eMI) {
		EMI = eMI;
	}
	public double getPrinciple() {
		return Principle;
	}
	public void setPrinciple(double principle) {
		Principle = principle;
	}
	public double getIntrest_rate() {
		return Intrest_rate;
	}
	public void setIntrest_rate(double intrest_rate) {
		Intrest_rate = intrest_rate;
	}
	public double getOutstanding_amount() {
		return Outstanding_amount;
	}
	public void setOutstanding_amount(double outstanding_amount) {
		Outstanding_amount = outstanding_amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
