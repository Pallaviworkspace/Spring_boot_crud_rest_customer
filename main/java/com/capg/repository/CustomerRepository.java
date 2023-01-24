package com.capg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Customer;

public interface CustomerRepository extends JpaRepository <Customer, Integer>{
	
}
