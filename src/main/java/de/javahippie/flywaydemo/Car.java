/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javahippie.flywaydemo;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author zoeller
 */
@Entity
@Table(name = "car")
public class Car {

    @Id
    @SequenceGenerator(name="pk_sequence",sequenceName="seq_car", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="pk_sequence")
    private Long id;

    @Column(name = "color")
    private String color;
    
    @Column(name = "make")
    private String make;
    
    @Column(name = "model")
    private String model;
    
    @Column(name = "build_date")
    private LocalDateTime buildDate;
    
    @Column(name = "hp")
    private Integer hp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(LocalDateTime buildDate) {
        this.buildDate = buildDate;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }
    
    
    
}