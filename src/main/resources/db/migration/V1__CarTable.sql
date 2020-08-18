/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  zoeller
 * Created: 18.08.2020
 */

CREATE TABLE CAR (
    id serial PRIMARY KEY,
    color VARCHAR(50),
    build_date TIMESTAMP,
    make VARCHAR(50),
    model VARCHAR(50)
);