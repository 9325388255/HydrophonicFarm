package com.masai.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.module.Product;

@Repository
public interface Product_Repo extends JpaRepository<Product, Integer> {
	
	public Optional<Product> findByName(String name);
}
