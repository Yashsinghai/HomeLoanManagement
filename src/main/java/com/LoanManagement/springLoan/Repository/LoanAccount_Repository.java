package com.LoanManagement.springLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanManagement.springLoan.DTO.LoanAccount;


public interface LoanAccount_Repository extends JpaRepository<LoanAccount, Integer> {
	
	
}
