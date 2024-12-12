package com.parking.parkinglot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "license_plate")
  private String licensePlate;

  @Column(name = "parking_spot")
  private String parkingSpot;

  @ManyToOne
  @JoinColumn(name = "owner_id")
  private User owner;

  @JoinColumn(name = "photo")
  private CarPhoto photo;

  @OneToOne(mappedBy= "car", cascade =CascadeType.ALL, fetch = FetchType.LAZY )
  public CarPhoto getPhoto() {
    return photo;
  }

  public void setPhoto(CarPhoto photo) {
    this.photo = photo;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }


  public String getParkingSpot() {
    return parkingSpot;
  }

  public void setParkingSpot(String parkingSpot) {
    this.parkingSpot = parkingSpot;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public void setLicensePlate(String licensePlate) {
    this.licensePlate = licensePlate;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}