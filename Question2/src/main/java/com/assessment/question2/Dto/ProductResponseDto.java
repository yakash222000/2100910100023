package com.assessment.question2.Dto;

import lombok.Data;

@Data
public class ProductResponseDto {
    private String productName;
    private double productPrice;
    private double productRating;
    private int productDiscount;
    private String productAvailability;

}
