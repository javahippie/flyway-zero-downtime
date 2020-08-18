/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.javahippie.flywaydemo;


import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zoeller
 */
@RestController
public class CarController {
    
    @Autowired
    EntityManager em;
            
    @GetMapping(path = "/")
    public ResponseEntity<List<Car>> findAll() {
        List<Car> cars = em.createQuery("SELECT C from Car C", Car.class).getResultList();
        
        return ResponseEntity.ok(cars);
    } 
    
    @PutMapping(path = "/")
    @Transactional
    public ResponseEntity create(RequestEntity<Car> request) {
        Car car = request.getBody();
        car.setBuildDate(LocalDateTime.now());
        em.persist(car);
        return ResponseEntity.ok(null);
    }
    
}
