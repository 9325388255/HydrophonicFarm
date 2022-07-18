package com.masai.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.module.Cart;

@Repository
public interface Cart_Repo extends JpaRepository<Cart, Integer>{

}
