package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Customer;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.serviceImpl.CustomerServiceImpl;

@SpringBootTest
public class CustomerServiceTest {
	
	@Autowired
	private CustomerServiceImpl service;
	
	@MockBean
	private CustomerRepository rep;
	
	@Test
	void getCustomerIdTest() {

	int customerId = 1;
	doReturn(Optional.of(new Customer("19", "AKHILAA", "Akhila@1234", "100","121234345657","Akhilaa","Bandhikee","Nesee","3456789022","akh@gmail.com","Female"))).when(rep).findById((long) customerId);

	

	}
	@Test
	void getCustomerAadhaarTest() {
		String aadhaar = "121234345657";
		doReturn(Optional.of(new Customer("19", "AKHILAA", "Akhila@1234", "100","121234345657","Akhilaa","Bandhikee","Nesee","3456789022","akh@gmail.com","Female"))).when(rep).findByAadhaarNumber((String) aadhaar);
	}
	@Test
	void getCustomerEmailTest() {
		String email = "akh@gmail.com";
		doReturn(Optional.of(new Customer("19", "AKHILAA", "Akhila@1234", "100","121234345657","Akhilaa","Bandhikee","Nesee","3456789022","akh@gmail.com","Female"))).when(rep).findByEmail((String) email);
	}
	@Test
	void getCustomerMobileNumberTest() {
		String mobileNumber = "3456789022";
		doReturn(Optional.of(new Customer("19", "AKHILAA", "Akhila@1234", "100","121234345657","Akhilaa","Bandhikee","Nesee","3456789022","akh@gmail.com","Female"))).when(rep).findByMobileNumber((String) mobileNumber);
	}
	@Test
	void getCustomerByfirstNameTest() {
		String firstName = "Akhilaa";
		doReturn(List.of(new Customer("19", "AKHILAA", "Akhila@1234", "100","121234345657","Akhilaa","Bandhikee","Nesee","3456789022","akh@gmail.com","Female"))).when(rep).findByFirstName((String) firstName);
	}
	
	
}
	