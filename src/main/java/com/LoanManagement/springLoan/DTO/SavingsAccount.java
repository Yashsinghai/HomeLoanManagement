package com.LoanManagement.springLoan.DTO;

public class SavingsAccount {
private int seq_id;
private long account_num;
private String name;
private String email;
private Double curr_balance;

//Getter and Setter
public int getSeq_id() {
	return seq_id;
}
public void setSeq_id(int seq_id) {
	this.seq_id = seq_id;
}
public long getAccount_num() {
	return account_num;
}
public void setAccount_num(long account_num) {
	this.account_num = account_num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Double getCurr_balance() {
	return curr_balance;
}
public void setCurr_balance(Double curr_balance) {
	this.curr_balance = curr_balance;
}



}
