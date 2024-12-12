package com.parking.parkinglot.entities;

import com.parking.parkinglot.Cars;
import jakarta.persistence.*;

@Entity
@Table(name = "carphoto")
public class CarPhoto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "file_name")
    String filename;

    @Column(name = "file_type")
   String fileType;

    @Lob
    @Column(name = "file_content")
    byte[] fileContent;

    @JoinColumn(name = "car")
    Car car;

    @OneToOne
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}