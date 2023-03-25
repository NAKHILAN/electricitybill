package com.capgemini.service;

import static org.mockito.Mockito.doReturn;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capgemini.entity.Customer;
import com.capgemini.entity.User;
import com.capgemini.repository.UserRepository;
import com.capgemini.serviceImpl.UserService;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private  UserService service;
	
	@MockBean
	private UserRepository rep;
	
	@Test
	void getUserByUserNameTest() {
		String userName = "AKHILA";
		doReturn(Optional.of(new User(1,"Akhilaa"))).when(rep).findByUserName((String) userName);
		
	}
	@Test
	void getUserByUserIdTest() {
		Long userId = (long) 1;
		doReturn(Optional.of(new User(1,"Akhilaa"))).when(rep).findById((long) userId);
		
	}
	
	

}
