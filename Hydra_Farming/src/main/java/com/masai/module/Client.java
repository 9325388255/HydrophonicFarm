package com.masai.module;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Clients")
public class Client extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer clientId;

}