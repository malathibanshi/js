package com.Bank.BankApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bank.BankApplication.Model.UserR;

public interface RegistrationRepo extends JpaRepository<UserR,Integer>{

}
