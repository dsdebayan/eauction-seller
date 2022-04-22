package com.hackfse.eauction.seller.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

@RestController
@RequestMapping("/e-auction/api/v1/seller")
//@RequestMapping
public class SellerController {

	@Autowired
	private EauctionProxy eauctionProxy;

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	@PostMapping("/add-product")
	public ResponseEntity<Void> addProduct(@RequestBody Product product) {

		eauctionProxy.addProduct(product);
		return ResponseEntity.created(null).build();
	}

	@DeleteMapping("/delete/{productId}")
	public void deleteProduct(@PathVariable int productId) {
		eauctionProxy.deleteProduct(productId);
	}

	@GetMapping("/show-bids/{productId}")
	public ProductInfo showBids(@PathVariable int productId) {

		ProductInfo bidProductInfo = eauctionProxy.showBids(productId);

		return bidProductInfo;
	}

}