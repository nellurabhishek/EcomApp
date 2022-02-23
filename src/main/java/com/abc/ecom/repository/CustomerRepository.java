package com.abc.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.abc.ecom.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}