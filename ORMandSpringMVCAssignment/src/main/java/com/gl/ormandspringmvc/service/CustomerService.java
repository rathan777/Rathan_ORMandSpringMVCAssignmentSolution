package com.gl.ormandspringmvc.service;

import java.util.List;

import com.gl.ormandspringmvc.entity.Customer;


public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer thecustomer);

	public void deleteById(int theId);

	

}
