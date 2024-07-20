package com.assessment.question2.Controller;

import com.assessment.question2.Dto.ProductResponseDto;
import com.assessment.question2.Entity.Product;
import com.assessment.question2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/companies/{companyName}/categories/{productCategory}")
    public List<ProductResponseDto> getTopProducts(@RequestParam int top,
                                        @RequestParam double minPrice,
                                        @RequestParam double maxPrice,
                                        @PathVariable String companyName,
                                        @PathVariable String productCategory) {
        List<ProductResponseDto> products= productService.filterProducts(top, minPrice, maxPrice, companyName, productCategory);
        return products;
    }
}
