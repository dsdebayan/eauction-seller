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

@CrossOrigin(origins={"http://localhost:3000", "http://localhost:8765"})
@RestController
@RequestMapping("/e-auction/api/v1/seller")
//@ConditionalOnProperty(name = "seller.read.enabled", havingValue = "true")
//@RequestMapping
public class SellerQueryController {

	@Autowired
	private EauctionProxy eauctionProxy;

	@GetMapping("/show-bids/{productId}")
	public ProductInfo showBids(@PathVariable int productId) {

		ProductInfo bidProductInfo = eauctionProxy.showBids(productId);

		return bidProductInfo;
	}

}