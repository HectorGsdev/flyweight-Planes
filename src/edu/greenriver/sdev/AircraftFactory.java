package edu.greenriver.sdev;

import java.util.HashMap;

/**
 *   @author Tarsem Bhachu
 *   @author Hector Gonzalez
 *   @version SDEV 426 presentation
 *
 */
//Step 3  Create a factory to generate object of concrete class based
// on given information: AircraftFactory.java
public class AircraftFactory
{
  private static final HashMap<String, IAircraft> airplaneMap = new HashMap<>();

    /**
     * @param typeOfPlane Indicates the type of plan
     * @return Returns an object of type Airplane
     */
  public static IAircraft getAirplane(String typeOfPlane){
      Airplane airplane = (Airplane)airplaneMap.get(typeOfPlane);
      System.out.println("A plane of type " +typeOfPlane +" is landing");

      if(airplane == null){   // comment out this remark to test implementation
          airplane = new Airplane(typeOfPlane);
          airplaneMap.put(typeOfPlane,airplane);
          System.out.println("* * * * * * * * * * * * * * * * * *");
          System.out.println("Creating Airplane of type: " + typeOfPlane);
          System.out.println("* * * * * * * * * * * * * * * * * *");
          System.out.println();
      }                     //

      return airplane;
  }

}
