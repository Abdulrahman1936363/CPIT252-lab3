
package com.mycompany.cpit252.lab3;

import java.util.List;


public class Car{
  String make;
  String model;
  int year;
  List<Recall>  recalls;
  public Car(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
    this.recalls = fetchCarRecalls();
  }
  private List<Recall> fetchCarRecalls(){
      // Emulate http request.
      try {
          Thread.sleep(2000);
      } catch (InterruptedException ex) {
          ex.printStackTrace();
      }
      return null;
  }
  public Car makeCopy(){
      return new Car(this.make, this.model, this.year);
  }
}
