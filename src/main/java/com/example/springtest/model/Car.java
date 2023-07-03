package com.example.springtest.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity // bunlardan iberet olacaq valuesi deyisecek
@Table(name = "users") // Tabelin adi
@Getter
@Setter
@AllArgsConstructor // kanstruktor
@NoArgsConstructor // bos konstrktir
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String brand;
    private  String ban;
    private  Integer count;
    private  Integer price;
    private  Integer year;
    private  String country;
    private Boolean vurugu;


}
