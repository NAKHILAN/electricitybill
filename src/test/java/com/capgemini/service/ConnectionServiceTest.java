package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Connection;
import com.capgemini.repository.ConnectionRepository;
import com.capgemini.serviceImpl.ConnectionServiceImpl;

@SpringBootTest
public class ConnectionServiceTest {
	
	@Autowired
	private ConnectionServiceImpl service;
	
	@MockBean
	private ConnectionRepository rep;
	
	@Test
	void getConnectionByConsumerNumberTest() {
		Long consumerNumber = (long) 453216;
		doReturn(Optional.of(new Connection(1,453216))).when(rep).findByConsumerNumber((Long) consumerNumber);
	}

}



