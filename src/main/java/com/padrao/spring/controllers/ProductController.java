package com.padrao.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.padrao.spring.entities.Product;
import com.padrao.spring.services.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("product", new Product());
		return "product/index";
	}
	
	@RequestMapping(value = "save", method=RequestMethod.POST)
	public String save(@ModelAttribute("product")Product product, ModelMap modelMap ) {
		Product newProduct = productService.create(product);
		modelMap.put("newProduct", newProduct);
		return "product/success";
	}
	
	@RequestMapping(value = "atualizar", method=RequestMethod.POST)
	public String update(@ModelAttribute("product")Product product, ModelMap modelMap ) {
		Product newProduct = productService.create(product);
		modelMap.put("newProduct", newProduct);
		return "product/success-update";
	}
	
}
