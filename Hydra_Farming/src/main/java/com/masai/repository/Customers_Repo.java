package com.masai.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.module.Customer;

@Repository
public interface Customers_Repo extends JpaRepository<Customer, Integer> {
	
	public Optional<Customer> findByUserNameAndUserPassword(String userName, String password);
}