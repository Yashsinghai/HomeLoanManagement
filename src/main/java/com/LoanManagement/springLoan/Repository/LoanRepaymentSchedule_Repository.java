package com.LoanManagement.springLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanManagement.springLoan.DTO.LoanRepaymentSchedule;


public interface LoanRepaymentSchedule_Repository extends JpaRepository<LoanRepaymentSchedule, Integer> {
	
}
