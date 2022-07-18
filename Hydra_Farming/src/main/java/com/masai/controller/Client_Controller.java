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
public class Client_Controller{
	
	@Autowired
	private Client_service client;

	@PostMapping("/acmefresh/client")
	public ResponseEntity<Client_Controller> storeUser(@RequestBody Client_Controller u){
		
		Client_Controller cm = client.addUser(u);
	
		
		return new ResponseEntity<Client_Controller>(cm, HttpStatus.OK);
	}
	
	@GetMapping("/acmefresh/client/{id}")
    public ResponseEntity<Client_Controller>	 getUserById(@PathVariable("id") Integer  userId ){
		
    	Client_Controller u =  client.findUserById(userId);
		
		if(u!=null) {
			return new ResponseEntity<Client_Controller> (u, HttpStatus.OK);
		}
		
		return null;
	}
	
	@PutMapping("/acmefresh/client/{id}")
	public ResponseEntity<Client_Controller> updateUser(@RequestBody Client_Controller u, @PathVariable("id") Integer id){
		
		Client_Controller cm = client.updatePassword(id, u);
		
		return new ResponseEntity<Client_Controller>(cm, HttpStatus.OK);
	}
	
	@DeleteMapping("/acmefresh/client/{id}")
	public ResponseEntity<Client_Controller> deleteUser(@PathVariable("id") Integer id){
		
		Client_Controller cm = client.deleteUserbyId(id);
		
		return new ResponseEntity<Client_Controller>(cm, HttpStatus.OK);
	}
	

}