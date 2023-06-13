package com.pizzacreed.PizzaCreed.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pizza_product")
public class PizzaProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String size;

    private double price;

	public PizzaProduct() {
		super();
	}

	public PizzaProduct(Integer id, String name, String size, double price) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
}
