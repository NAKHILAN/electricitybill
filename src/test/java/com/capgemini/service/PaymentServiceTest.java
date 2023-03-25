package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Bill;

import com.capgemini.repository.PaymentRepository;
import com.capgemini.serviceImpl.PaymentService;

@SpringBootTest
public class PaymentServiceTest {
	
	@Autowired
	private PaymentService service;
	@MockBean
	private PaymentRepository rep;
	
	@Test
	void viewHistoricalPayment() {
		Long consumerNumber = (long) 453216;
		doReturn(List.of(new Bill(1, 453216))).when(rep).readHistoricalPaymentByConsumerNumber((long) consumerNumber);
	
	}

}
