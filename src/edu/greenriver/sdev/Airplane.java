package edu.greenriver.sdev;
/**
 *
 * * @author Tarsem Bhachu
 * @author Hector Gonzalez
 * @version SDEV 426 presentation
 *
 * Step 2 =- Create a concrete (Airplane) class that implements the interface from step 1 (IAircraft.java)
 *
 */

public class Airplane implements IAircraft
{
    private String typeOfPlane;
    private int longitude;
    private int latitude;
    private int fuel;

    /**
     * @param typeOfPlane Designation of the plane
     */
    public Airplane(String typeOfPlane){ this.typeOfPlane = typeOfPlane;}

    /**
     * @param longitude Longitude of the plane
     */
    public void setLongitude(int longitude)
    {
        this.longitude = longitude;
    }

    /**
     * @param latitude  Latitude of the plane
     */
    public void setLatitude(int latitude)
    {
        this.latitude = latitude;
    }

    /**
     * @param fuel  Fuel
     */
    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }

    @Override
    public void land()
    {
        System.out.println("Aircraft: " + typeOfPlane + " Has landed, longitude: "
                + longitude+ " Latitude " + latitude+ " Fuel: " + fuel);
        System.out.println();


    }

//    @Override
//    public String toString()
//    {
//        return "Airplane{" + "typeOfPlane='" + typeOfPlane + '\'' +
//                ", longitude=" + longitude +
//                ", latitude=" + latitude +
//                ", fuel=" + fuel +
//                '}';
//    }
}
