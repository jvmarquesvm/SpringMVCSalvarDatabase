package com.padrao.spring.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padrao.spring.entities.Product;
import com.padrao.spring.repositories.ProductRepository;

@Transactional
@Service("productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product create(Product produto) {
		return productRepository.save(produto);
	}

	//@Override
	//public Product update(Product produto) {
	//	return productRepository.save(produto);
	//}
	
}
