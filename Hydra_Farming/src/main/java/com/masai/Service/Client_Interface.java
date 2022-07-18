package com.masai.Service;
import com.masai.module.Client;

public interface Client_Interface {
	
	public Client addUser(Client user);
	
	public Client findUserById(Integer user_Id);
	
	public Client findByUsernameAndPassword(String userName,String userPassword);

	public Client updatePassword(Integer user_id, Client user);
	
	public Client deleteUserbyId(Integer user_id);

}
