package com.hackfse.eauction.seller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackfse.eauction.seller.EauctionProxy;
import com.hackfse.eauction.seller.beans.ProductInfo;
import com.hackfse.eauction.seller.entities.Product;

@CrossOrigin(origins={"http://localhost:3000", "http://localhost:8765"})
@RestController
@RequestMapping("/e-auction/api/v1/seller")
@ConditionalOnProperty(name = "seller.write.enabled", havingValue = "true")
//@RequestMapping
public class SellerCommandController {

	@Autowired
	private EauctionProxy eauctionProxy;

	
	
	@PostMapping("/add-product")
	public ResponseEntity<Void> addProduct(@RequestBody Product product) {

		eauctionProxy.addProduct(product);
		return ResponseEntity.created(null).build();
	}

	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		eauctionProxy.deleteProduct(productId);
	}

	
}