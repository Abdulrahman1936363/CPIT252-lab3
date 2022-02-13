
package com.mycompany.cpit252.lab3;


public class CarFactory {
    public Car getClone(Car carSample){
        return carSample.makeCopy();
    }
}
