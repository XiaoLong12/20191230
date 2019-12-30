package com.itheima.service;

import com.itheima.mapper.ProductMapper;
import com.itheima.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductMapper productMapper;
    public Map<String, Object> findAllProducts() {
        List<Product> allProducts = productMapper.findAllProducts();
        Map<String, Object> map = new HashMap<String, Object>();
        //2.准备一个List<String>  xDataList 空的,将来要存储商品名称
        List<String> xDataList = new ArrayList<String>();

        //3.准备一个List<Long>  xseriesList 空,将要要存储商品数量
        List<Long> xseriesList = new ArrayList<Long>();

        for (Product product : allProducts) {
            xDataList.add(product.getName());
            xseriesList.add(product.getMount());
        }
        map.put("xData",xDataList);
        map.put("seriesData",xseriesList);
        return map;
    }
}
