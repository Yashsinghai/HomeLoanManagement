package com.LoanManagement.springLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanManagement.springLoan.DTO.User;


public interface User_Repository extends JpaRepository<User, Integer> {
	
}
