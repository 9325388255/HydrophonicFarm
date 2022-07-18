package com.masai.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masai.module.Product;
import com.masai.repository.Product_Repo;

@Service
public class Product_Service implements Product_Interface {
	
	@Autowired
	private Product_Repo pr;
	
	@Override
	public Product addProduct(Product tech) {
		return pr.save(tech);
	}

	@Override
	public Product getProductList(String name) {
		
		Optional<Product> pg = pr.findByName(name);
		
		if(pg.isPresent()) {
			return pg.get();
		}
		return null;
	}
}