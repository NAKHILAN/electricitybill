package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Bill;
import com.capgemini.entity.Connection;
import com.capgemini.repository.BillRepository;
import com.capgemini.serviceImpl.BillServiceImpl;

@SpringBootTest
public class BillServiceTest {
	
	@Autowired
	private BillServiceImpl service;
	
	@MockBean
	private BillRepository rep;
	
	@Test
	void  viewBillTest() {
		Long consumerNumber = (long) 453216;
		doReturn(Optional.of(new Bill(1,453216))).when(rep).viewBillByConsumerNumber((Long) consumerNumber);
		
	}
	@Test
	void  viewBillByMobileNumberTest() {
		String mobileNumber = "5432167890";
		doReturn(Optional.of(new Bill(1,"5432167890"))).when(rep).viewBillByMobileNumber((String) mobileNumber);
		
	}
	@Test
	void  viewBillByEmailTest() {
		String email = "akh@gmail.com";
		doReturn(Optional.of(new Bill(1,"akh@gmail.com"))).when(rep).viewBillByEmail((String) email);
		
	}
	

}
