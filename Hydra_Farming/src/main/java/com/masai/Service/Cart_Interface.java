package com.masai.Service;

public interface Cart_Interface{
	
	public Cart_Interface addItemToCart(Integer cartid, Integer itemname) ;

	public Cart_Interface saveCart(Cart_Interface cart);

	public Cart_Interface viewCartByCartId(Integer cartId);

	public Cart_Interface removeCart(Integer cartId);
}