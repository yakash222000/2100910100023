package com.assessment.question2.Service;

import com.assessment.question2.Dto.ProductResponseDto;
import com.assessment.question2.Entity.Product;

import java.util.List;

public interface ProductService {

    public List<ProductResponseDto> filterProducts(int top, double minPrice, double maxPrice,String companyName,String category);


}
