package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
  @Id
  @GeneratedValue()
  private long clientId;

  @Column(nullable = false)
  private long advisorId;

  @Column(nullable = false)
  private String clientFirstName;

  @Column(nullable = false)
  private String clientLastName;

  @Column(nullable = false)
  private String clientEmail;

  @Column(nullable = false)
  private String clientPhone;

  @Column(nullable = false)
  private String clientAddress;

  protected Client() {}

  public Client(String clientAddress, String clientPhone, String clientEmail, String clientLastName, String clientFirstName, long advisorId, long clientId) {
    this.clientAddress = clientAddress;
    this.clientPhone = clientPhone;
    this.clientEmail = clientEmail;
    this.clientLastName = clientLastName;
    this.clientFirstName = clientFirstName;
    this.advisorId = advisorId;
    this.clientId = clientId;
  }

  public String getClientFirstName() {
    return clientFirstName;
  }

  public void setClientFirstName(String clientFirstName) {
    this.clientFirstName = clientFirstName;
  }

  public String getClientLastName() {
    return clientLastName;
  }

  public void setClientLastName(String clientLastName) {
    this.clientLastName = clientLastName;
  }

  public String getClientEmail() {
    return clientEmail;
  }

  public void setClientEmail(String clientEmail) {
    this.clientEmail = clientEmail;
  }

  public String getClientPhone() {
    return clientPhone;
  }

  public void setClientPhone(String clientPhone) {
    this.clientPhone = clientPhone;
  }

  public String getClientAddress() {
    return clientAddress;
  }

  public void setClientAddress(String clientAddress) {
    this.clientAddress = clientAddress;
  }
}
