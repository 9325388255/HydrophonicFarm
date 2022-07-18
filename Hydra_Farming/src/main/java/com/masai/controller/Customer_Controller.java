package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Customer_Controller{
	
	@Autowired
	private Custumer_Service client;

	@PostMapping("/acmefresh/customer")
	public ResponseEntity<Customer_Controller> storeUser(@RequestBody Customer_Controller u){
		
		Customer_Controller cm = client.addUser(u);
		
		
		return new ResponseEntity<Customer_Controller>(cm, HttpStatus.OK);
	}
	
	@GetMapping("/acmefresh/customer/{id}")
    public ResponseEntity<Customer_Controller>	 getUserById(@PathVariable("id") Integer  userId ){
		
    	Customer_Controller u =  client.findUserById(userId);
		
		if(u!=null) {
			return new ResponseEntity<Customer_Controller> (u, HttpStatus.OK);
		}
		
		return null;
	}
	
	@PutMapping("/acmefresh/customer/{id}")
	public ResponseEntity<Customer_Controller> updateUser(@RequestBody Customer_Controller u, @PathVariable("id") Integer id){
		
		Customer_Controller cm = client.updatePassword(id, u);
		
		return new ResponseEntity<Customer_Controller>(cm, HttpStatus.OK);
	}
	
	@DeleteMapping("/acmefresh/customer/{id}")
	public ResponseEntity<Customer_Controller> deleteUser(@PathVariable("id") Integer id){
		
		Customer_Controller cm = client.deleteUserbyId(id);
		
		return new ResponseEntity<Customer_Controller>(cm, HttpStatus.OK);
	}
	

}
