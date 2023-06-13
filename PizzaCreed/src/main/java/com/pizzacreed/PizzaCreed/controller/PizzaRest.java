package com.pizzacreed.PizzaCreed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pizzacreed.PizzaCreed.model.PizzaProduct;
import com.pizzacreed.PizzaCreed.services.PizzaRestService;


@RestController
@RequestMapping("/api")

public class PizzaRest {
	
	@Autowired
	private PizzaRestService pizzaRestService;
	
	//store and update Pizza
	@PostMapping("/pizza")
	public PizzaProduct storePizza(@RequestBody PizzaProduct pizzaProduct) {
		
		return pizzaRestService.addPizza(pizzaProduct);
	}
	
	//View Pizza
	@GetMapping("/pizza/all")
	public Iterable <PizzaProduct>allPizzaRec(){
		
		return pizzaRestService.allPizza();
	}
	
	
	//View By ID Pizza
	@GetMapping("/pizza/{id}")
	public PizzaProduct viewByIDpizza(@PathVariable Integer id) {
		
		return pizzaRestService.findByIdPizza(id);
		
	}
	
	// Delete Pizza
	@DeleteMapping("/pizza/delete/{id}")
	public ResponseEntity<String> deletePizza(@PathVariable Integer id) {

	    pizzaRestService.deletePizzaById(id);

	    return ResponseEntity.ok("Deleted");
	}

}
