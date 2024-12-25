package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "securities")
public class Security {

  @Id
  @GeneratedValue()
  @Column(name = "security_id")
  private int securityId;

  @ManyToOne
  @JoinColumn(name = "client_id", nullable = false)
  private Portfolio portfolio;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "category", nullable = false)
  private String category;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "purchase_date", nullable = false)
  private Date purchaseDate;

  @Column(name = "purchase_price", nullable = false)
  private double purchasePrice;

  @Column(name = "quantity", nullable = false)
  private int quantity;

  @CreationTimestamp
  @Column(name = "created_at", nullable = false, updatable = false)
  private Date createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;

  public Security() {}

  public Security(int securityId, Portfolio portfolio, String name, String category, Date purchaseDate, double purchasePrice, int quantity, Date createdAt, Date updatedAt) {
    this.securityId = securityId;
    this.portfolio = portfolio;
    this.name = name;
    this.category = category;
    this.purchaseDate = purchaseDate;
    this.purchasePrice = purchasePrice;
    this.quantity = quantity;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Date getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(Date purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public double getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(double purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
