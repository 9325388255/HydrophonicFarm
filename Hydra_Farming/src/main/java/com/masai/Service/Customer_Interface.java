package com.masai.Service;
import com.masai.module.Customer;

public interface Customer_Interface {
	
	public Customer addUser(Customer user);
	
	public Customer findUserById(Integer user_Id);
	
	public Customer findByUsernameAndPassword(String userName,String userPassword);

	public Customer updatePassword(Integer user_id, Customer user);
	
	public Customer deleteUserbyId(Integer user_id);
}