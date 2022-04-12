package com.LoanManagement.springLoan.DTO;

public class LoanAccount {

	private int Loan_account_id;
	private double Savings_account;
	private double Total_loan_ammount;
	private double Int_rate;
	private double Tenure;
	private String Status;
	public int getLoan_account_id() {
		return Loan_account_id;
	}
	public void setLoan_account_id(int loan_account_id) {
		Loan_account_id = loan_account_id;
	}
	public double getSavings_account() {
		return Savings_account;
	}
	public void setSavings_account(double savings_account) {
		Savings_account = savings_account;
	}
	public double getTotal_loan_ammount() {
		return Total_loan_ammount;
	}
	public void setTotal_loan_ammount(double total_loan_ammount) {
		Total_loan_ammount = total_loan_ammount;
	}
	public double getInt_rate() {
		return Int_rate;
	}
	public void setInt_rate(double int_rate) {
		Int_rate = int_rate;
	}
	public double getTenure() {
		return Tenure;
	}
	public void setTenure(double tenure) {
		Tenure = tenure;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
}
