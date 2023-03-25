package com.capgemini.service;

import java.util.Date;
import java.util.List;

import com.capgemini.entity.Bill;
import com.capgemini.entity.ConnectionType;
import com.capgemini.entity.Reading;
import com.capgemini.exception.InvalidReadingException;
import com.capgemini.exception.NoSuchConnectionException;
import com.capgemini.exception.NoSuchCustomerException;

public interface IBillService 
{
	public Bill generateBill(Reading reading) throws InvalidReadingException;
	public Bill viewBillByConsumerNumber(Long consumerNumber) throws NoSuchConnectionException;
	public Bill viewBillByMobileNumber(String mobile) throws NoSuchCustomerException;
	public Bill viewBillByEmail(String email) throws NoSuchCustomerException;
	public List<Bill> viewBillForDateRange(Date from, Date to) throws NoSuchCustomerException;
	public double energyBillCalculator(ConnectionType connectionType ,double units);
	public void emailBillToCustomer(Long consumerNumber, String email) throws NoSuchConnectionException;
	
	

}
