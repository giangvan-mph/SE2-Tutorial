package com.example.springboot3.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;

@Entity
@Table (name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    @Length(min = 3, max = 30)
    private String name;

    @Column(name = "age")
    @Min(18)
    @Max(55)
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "image")
    @NotEmpty(message = "Image can not be empty")
    private String image;


    public Employee (String name, int age, String address, String image) {
        super();
        this.name = name;
        this.address = address;
        this.age = age;
        this.image = image;
    }

    public Employee () {
        super();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImage() {
        return image;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
