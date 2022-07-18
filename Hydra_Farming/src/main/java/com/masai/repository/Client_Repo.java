package com.masai.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.module.Client;

@Repository
public interface Client_Repo extends JpaRepository<Client, Integer>{
	
	public Optional<Client> findByUserNameAndUserPassword(String userName, String password);

}