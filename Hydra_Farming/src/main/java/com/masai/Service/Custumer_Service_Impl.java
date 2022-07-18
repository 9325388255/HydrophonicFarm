package com.masai.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.module.Customer;
import com.masai.repository.Customers_Repo;

@Service
public class Custumer_Service_Impl implements Customer_Interface{
	private Customers_Repo repo;

	@Override
	public Customer addUser(Customer user) {
		return repo.save(user);
	
	}

	@Override
	public Customer findUserById(Integer user_Id) {
		Optional<Customer> oc  =repo.findById(user_Id);
		if(oc.isPresent()) {
			return oc.get();
		}
		return null;
	}

	@Override
	public Customer findByUsernameAndPassword(String userName, String userPassword) {
		Optional<Customer> oc = repo.findByUserNameAndUserPassword(userName, userPassword);
		if(oc.isPresent()) {
			return oc.get();
		}
		return null;
	}

	@Override
	public Customer updatePassword(Integer user_id, Customer user) {
		Optional<Customer> us = repo.findById(user_id);
		
		if(us.isPresent()) {
			
			return repo.save(user);
		}
		
		return null;
	}

	@Override
	public Customer deleteUserbyId(Integer user_id) {
		Optional<Customer> us = repo.findById(user_id);
		
		if(us.isPresent()) {
			Customer u = us.get();
			
			repo.delete(u);
			
			return u;
		}
		
		return null;
	}

}