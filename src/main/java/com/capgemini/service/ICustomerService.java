package com.capgemini.service;

import java.util.List;

import javax.validation.Valid;

import com.capgemini.entity.Customer;
import com.capgemini.exception.DuplicateCustomerException;
import com.capgemini.exception.NoSuchCustomerException;

public interface ICustomerService {

	public Customer registerCustomer(Customer customer) throws DuplicateCustomerException;

	public Customer viewCustomerProfile(long customerId) throws NoSuchCustomerException;

	public Customer editCustomerProfile(long customerId,Customer customer) throws NoSuchCustomerException;

	//public Customer searchCustomerByCustomerId(Long customerId) throws NoSuchCustomerException;

	public Customer searchCustomerByEmail(String email) throws NoSuchCustomerException;

	public Customer searchCustomerByAadhaar(String customerId) throws NoSuchCustomerException;

	public Customer searchCustomerByMobile(String mobile) throws NoSuchCustomerException;

	public List<Customer> searchCustomerByName(String customerName) throws NoSuchCustomerException;

	public Customer searchCustomerByCustomerId(long customerId) throws NoSuchCustomerException;

	
	

	//Customer viewCustomerProfile(String customerId) throws NoSuchCustomerException;
}
