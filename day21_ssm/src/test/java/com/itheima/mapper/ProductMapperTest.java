package com.itheima.mapper;

import com.itheima.pojo.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ProductMapperTest {

    @Autowired
    public ProductMapper productMapper;

    @Test
    public void findAllProducts() {
        List<Product> allProducts = productMapper.findAllProducts();
        System.out.println(allProducts);
    }
}