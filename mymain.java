
package com.mycompany.cpit252.lab3;


public class mymain {
    public static void main(String[] args) {
     
        Car c= new Car("TOYOTA", "CAMRY", 2000);
      CarFactory carFac = new CarFactory();
        Car c2 = carFac.getClone(c);
        
        System.out.println(c.hashCode() == c2.hashCode());
        
    }
   
}
