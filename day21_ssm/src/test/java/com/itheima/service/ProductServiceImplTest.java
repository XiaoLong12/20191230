package com.itheima.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class ProductServiceImplTest {
    @Autowired
    public ProductService productService;

    @Test
    public void findAllProducts() {
        Map<String, Object> allProducts = productService.findAllProducts();
        System.out.println(allProducts);
    }
}