package com.itheima.controller;

import com.itheima.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @RequestMapping("productList.action")
    @ResponseBody
    public Map<String, Object> find(){
        Map<String, Object> products = productService.findAllProducts();
        return products;
    }
}
