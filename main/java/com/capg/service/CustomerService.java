package com.capg.service;
import java.util.List; 
import com.capg.entity.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(int id);
}
