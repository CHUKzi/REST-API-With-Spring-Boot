package com.pizzacreed.PizzaCreed.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizzacreed.PizzaCreed.model.PizzaProduct;
import com.pizzacreed.PizzaCreed.repository.PizzaRepo;

@Service
public class PizzaRestService {
	
	@Autowired
	private PizzaRepo pizzaRepo;

	//Store Or Update
	public PizzaProduct addPizza(PizzaProduct pizzaProduct) {
		return pizzaRepo.save(pizzaProduct);
	}
	
	//View All
	public Iterable <PizzaProduct> allPizza(){
		return pizzaRepo.findAll();
	}
	
	//View By ID
	public PizzaProduct findByIdPizza(Integer id) {
		Optional<PizzaProduct> optionalPizza = pizzaRepo.findById(id);
	    return optionalPizza.orElse(null);
	}
	
	//Delete
    public void deletePizzaById(Integer id) {
        pizzaRepo.deleteById(id);
    }
}
