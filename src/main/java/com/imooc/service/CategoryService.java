package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * CategoryService
 *
 * @author Achin
 * @since 2019-06-30 13:45
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
