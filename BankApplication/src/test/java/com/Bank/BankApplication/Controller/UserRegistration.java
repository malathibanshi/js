package com.Bank.BankApplication.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.BankApplication.Model.UserR;
import com.Bank.BankApplication.Repository.RegistrationRepo;

@RestController
public class UserRegistration {
	RegistrationRepo registrationRepo;
@PostMapping("/registration")
public ResponseEntity<UserR>saveDetails(@RequestBody UserR userr) {
	return new ResponseEntity<>(registrationRepo.save(userr),HttpStatus.CREATED);
}
}
