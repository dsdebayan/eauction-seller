package com.hackfse.eauction.seller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.hackfse.eauction.seller.beans.ProductInfo;
import com.hackfse.eauction.seller.entities.Product;

@FeignClient(name="warehouse")
public interface EauctionProxy {

	@PostMapping("/e-auction/api/v1/seller/add-product")
	public ResponseEntity<Void> addProduct(@RequestBody Product product);
	
	@DeleteMapping("/e-auction/api/v1/seller/delete/{productId}")
	public void deleteProduct(@PathVariable int productId);
	
	@GetMapping("/e-auction/api/v1/seller/show-bids/{productId}")
	public ProductInfo showBids(@PathVariable int productId);
}
