package com.peanut.service;

import com.peanut.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> select();

    List<Product> selectNav(Integer cid);

}
