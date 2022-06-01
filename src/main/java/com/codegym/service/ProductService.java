package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private final static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1,"iphoneX",1000,"maydeu","apple"));
        products.add(new Product(2,"GalaxyS10",2000,"mayxin","samsung"));
        products.add(new Product(3,"iphone12",5000,"mayxin","apple"));
        products.add(new Product(4,"vertu",2000,"mayxin","vertu"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id-1);
    }

    @Override
    public void update(int id, Product product) {
       products.add(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
    @Override
    public Product findByName(String name) {
        Product product = new Product();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)){
                product = products.get(i);
            }
        }
        return product;
    }
}
