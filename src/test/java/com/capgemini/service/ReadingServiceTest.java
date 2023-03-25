package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Customer;
import com.capgemini.entity.Reading;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.repository.ReadingRepository;
import com.capgemini.serviceImpl.CustomerServiceImpl;
import com.capgemini.serviceImpl.ReadingService;

@SpringBootTest
public class ReadingServiceTest {
	
	@Autowired
	private ReadingService service;
	
	@MockBean
	private ReadingRepository rep;
	
	@Test
	void getReadingTest() {
		Long consumerNumber = (long) 453216;
		doReturn(Optional.of(new Reading(1,1001, "Photo", "2023-03-24T15:26:58.597Z",45.08))).when(rep).findMeterReadingByConsumerNumber((Long) consumerNumber);
	}

}
