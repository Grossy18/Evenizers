package com.example.evenizers.entity;

import jakarta.persistence.*;

@Entity
public class ProductDescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String packageIncludes;

    @Lob
    private String faqs;

    @Lob
    private String deliveryDetails;

    @Lob
    private String careInfo;

    // Constructors
    public ProductDescription() {}

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPackageIncludes() { return packageIncludes; }
    public void setPackageIncludes(String packageIncludes) { this.packageIncludes = packageIncludes; }

    public String getFaqs() { return faqs; }
    public void setFaqs(String faqs) { this.faqs = faqs; }

    public String getDeliveryDetails() { return deliveryDetails; }
    public void setDeliveryDetails(String deliveryDetails) { this.deliveryDetails = deliveryDetails; }

    public String getCareInfo() { return careInfo; }
    public void setCareInfo(String careInfo) { this.careInfo = careInfo; }
}
