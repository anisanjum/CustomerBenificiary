package com.fundtransfer.dao;

import org.springframework.data.repository.CrudRepository;

import com.fundtransfer.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
