package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "portfolios")
public class Portfolio {

  @Id
  @Column(name = "client_id", nullable = false)
  private int clientId;

  @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Security> securities;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_at", nullable = false, updatable = false)
  private Date createdAt;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "updated_at", nullable = false)
  private Date updatedAt;

  protected Portfolio() {}

  public Portfolio(int clientId, Date createdAt, Date updatedAt, List<Security> securities) {
    this.clientId = clientId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.securities = securities;
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

  public List<Security> getSecurities() {
    return securities;
  }

  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }
}
