package com.masai.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.module.Product;
import com.masai.repository.Cart_Repo;
import com.masai.repository.Product_Repo;

@Service
public class Cart_Service implements Cart_Interface{

	@Autowired
	private Cart_Repo cr;
	
	@Autowired
	private Product_Repo ri;

	@Override
	public Cart_Interface addItemToCart(Integer cartid, Integer itemname) {
		
		Optional<Cart_Interface> cart = cr.findById(cartid);
		
		if(cart.isPresent()) {

			
			Optional<Product> item = ri.findById(itemname);

			if(item.isPresent()) {
				Cart_Interface c = cart.get();
				
				List<Product> lis = new ArrayList<>();
				
				lis.addAll(c.getProduct());
				lis.add(item.get());
				
				c.setProduct(lis);
				
				return c;
			}
		}
		
		return null;
	}

	@Override
	public Cart_Interface saveCart(Cart_Interface cart) {
		return cr.save(cart);
	}

	@Override
	public Cart_Interface viewCartByCartId(Integer cartId) {
		Optional<Cart_Interface> f=cr.findById(cartId);
		 if(f.isPresent()) {
	       	Cart_Interface existingcart= f.get();
	       	
	       	return existingcart;
		   }
		return null;
	}

	@Override
	public Cart_Interface removeCart(Integer cartId) {
		
		   Optional<Cart_Interface> f=cr.findById(cartId);
		   if(f.isPresent()) {
	       	Cart_Interface existingcart= f.get();
	       	
	       	cr.delete(existingcart);
	       	
	       	return existingcart;
	       	
		   }
		   return null;
	}
}