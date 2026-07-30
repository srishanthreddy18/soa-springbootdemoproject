package com.klef.soa.service;

import java.util.List;

import com.klef.soa.ProductDTO;

public interface APIService {
List<ProductDTO>diplayAllproduct();
ProductDTO displayProductByid();
ProductDTO displayProductByid(int id);

}