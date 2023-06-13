package com.pizzacreed.PizzaCreed.repository;

import org.springframework.data.repository.CrudRepository;

import com.pizzacreed.PizzaCreed.model.PizzaProduct;

public interface PizzaRepo extends CrudRepository<PizzaProduct, Integer> {

}