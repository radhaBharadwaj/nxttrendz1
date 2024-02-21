package com.example.nxttrendz1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.ArrayList;
import java.util.List;

import com.example.nxttrendz1.model.Product;
import com.example.nxttrendz1.repository.ProductJpaRepository;
import com.example.nxttrendz1.repository.ProductRepository;

@Service
public class ProductJpaService implements ProductRepository {

	@Autowired
	private ProductJpaRepository jpaRepository;

	@Override
	public ArrayList<Product> getProducts() {
		List<Product> lProducts = jpaRepository.findAll();
		ArrayList<Product> arrProducts = new ArrayList<>(lProducts);
		return arrProducts;
	}

	@Override
	public Product addProduct(Product product) {
		jpaRepository.save(product);
		return product;
	}

}