package com.pizzacreed.PizzaCreed.model;

import jakarta.persistence.*;

@Entity
@Table(name = "shopping_basket")

public class ShoppingBasket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	private Integer pizza_id;
	
	private Integer user_id;
	
	private Integer qty;

	public ShoppingBasket() {
		super();
	}

	public ShoppingBasket(Integer id, Integer pizza_id, Integer user_id, Integer qty) {
		super();
		this.id = id;
		this.pizza_id = pizza_id;
		this.user_id = user_id;
		this.qty = qty;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPizza_id() {
		return pizza_id;
	}

	public void setPizza_id(Integer pizza_id) {
		this.pizza_id = pizza_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}
	
	

}

