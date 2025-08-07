package com.example.evenizers.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private double originalPrice;

    private String imageUrl;

    private double rating;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> availableCities;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ProductDescription description;

    // Constructors
    public Product() {}

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(double originalPrice) { this.originalPrice = originalPrice; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public List<String> getAvailableCities() { return availableCities; }
    public void setAvailableCities(List<String> availableCities) { this.availableCities = availableCities; }

    public ProductDescription getDescription() { return description; }
    public void setDescription(ProductDescription description) { this.description = description; }
}
