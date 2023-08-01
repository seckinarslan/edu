package com.sample.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ProductBean implements Serializable {
	private static final long serialVersionUID = -9153247473389897352L;
	 private List<Product> productList;
	    private Product newProduct;

	    @PostConstruct
	    public void init() {
	        productList = new ArrayList<>();
	        newProduct = new Product();
	    }

	    public List<Product> getProductList() {
	        return productList;
	    }

	    public Product getNewProduct() {
	        return newProduct;
	    }

	    public void setNewProduct(Product newProduct) {
	        this.newProduct = newProduct;
	    }

	    public void addProduct() {
	        productList.add(newProduct);
	        newProduct = new Product();
	    }
    }
