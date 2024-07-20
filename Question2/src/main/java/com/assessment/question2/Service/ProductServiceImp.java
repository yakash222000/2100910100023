package com.assessment.question2.Service;

import com.assessment.question2.Dto.ProductResponseDto;
import com.assessment.question2.Entity.Product;
import com.assessment.question2.Repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductServiceImp implements ProductService {
    private ProductRepository productRepository;
    @Override
    public List<ProductResponseDto> filterProducts(int top, double minPrice, double maxPrice, String companyName, String category) {
        List<Product> products = productRepository.findAll();
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        for (Product product : products) {
            if(product.getProductPrice()>=minPrice &&
                    product.getProductPrice()<=maxPrice &&
                    product.getCompanyName().equals(companyName) &&
                    product.getProductCategory().equals(category)){
                ProductResponseDto productResponseDto = new ProductResponseDto();
                productResponseDto.setProductAvailability(product.getProductAvailability());
                productResponseDto.setProductName(product.getProductName());
                productResponseDto.setProductPrice(product.getProductPrice());
                productResponseDto.setProductDiscount(product.getProductDiscount());
                productResponseDto.setProductRating(product.getProductRating());
                productResponseDtos.add(productResponseDto);
            }

        }
        Collections.sort(productResponseDtos,new Comparator<ProductResponseDto>() {
            @Override
            public int compare(ProductResponseDto o1, ProductResponseDto o2) {
                return Double.compare(o1.getProductRating(), o2.getProductRating());
            }
        });

        return productResponseDtos;

    }
}
