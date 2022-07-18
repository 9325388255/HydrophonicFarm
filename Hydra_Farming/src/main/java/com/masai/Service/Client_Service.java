package com.masai.Service;
import com.masai.module.Client;
import com.masai.repository.Client_Repo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


	@Service
	public class Client_Service implements Client_Interface {
		
		@Autowired
		private Client_Repo client_A;

		@Override
		public Client addUser(Client user) {
			
			return client_A.save(user);
		}

		@Override
		public Client findUserById(Integer user_Id) {
			
			Optional<Client> ob = client_A.findById(user_Id);
			if(ob.isPresent()) {
				return ob.get();
			}
			
			return null;
		}

		@Override
		public Client findByUsernameAndPassword(String userName, String userPassword) {
			Optional<Client> ob = client_A.findByUserNameAndUserPassword(userName, userPassword);
			if(ob.isPresent()) {
				return ob.get();
			}
			
			return null;
		}

		@Override
		public Client updatePassword(Integer user_id, Client user) {
			Optional<Client> us = client_A.findById(user_id);
			
			if(us.isPresent()) {
				
				return client_A.save(user);
			}
			
			return null;
		}

		@Override
		public Client deleteUserbyId(Integer user_id) {
			Optional<Client> us = client_A.findById(user_id);
			
			if(us.isPresent()) {
				Client u = us.get();
				
				client_A.delete(u);
				
				return u;
			}
			
			return null;
		}

	}
