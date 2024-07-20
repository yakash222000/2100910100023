package com.assessment.question2.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String productName;

    private double productPrice;

    private double productRating;

    private int productDiscount;

    private String productAvailability;

    private String companyName;

    private String productCategory;
}
