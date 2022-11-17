package edu.greenriver.sdev;

/**
 *
 * @author Tarsem Bhachu
 * @author Hector Gonzalez
 * @version SDEV 426 presentation
 */
public class Main {
    private static final String[] AircraftTypes =
            {"F/A-18", "DC-10","F-14","C-130","C-40","C-20"};
    public static final int PLANES_LANDING = 40;
    public static final int MAX_FUEL = 300;

    /**
     * @param args Entry point for this program
     */
    public static void main(String[] args) {
        for (int i = 0; i < PLANES_LANDING; i++)
        {
            Airplane airplane = (Airplane) AircraftFactory.getAirplane(getRandomType());
            airplane.setLongitude(getRandomLongitude());
            airplane.setLatitude(getRandomLatitude());
            airplane.setFuel(getRandomFuel());
            airplane.land();
//            System.out.println(airplane);
// uncomment this line to see the objects

        }
    }

    private static String getRandomType(){
        return AircraftTypes [(int) (Math.random()*AircraftTypes.length)];
    }
    private static int getRandomLatitude(){
        return (int) (Math.random()*100);
    }
    private static int getRandomLongitude(){
        return (int)(Math.random()*100);
    }
    private static int getRandomFuel(){
        return (int)(Math.random()* MAX_FUEL);
    }

}
