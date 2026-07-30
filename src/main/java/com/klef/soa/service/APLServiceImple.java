package com.klef.soa.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.soa.ProductDTO;

@Service
public class APLServiceImple implements APIService {

    @Autowired
    private RestTemplate template;

    String apiurl = "https://fakestoreapi.com/products";

    @Override
    public List<ProductDTO> diplayAllproduct() {
        ProductDTO[] data = template.getForObject(apiurl, ProductDTO[].class);
        return Arrays.asList(data);
    }

    @Override
    public ProductDTO displayProductByid(int id) {
        return template.getForObject(apiurl + "/" + id, ProductDTO.class);
    }

    @Override
    public ProductDTO displayProductByid() {
        return null;
    }
}