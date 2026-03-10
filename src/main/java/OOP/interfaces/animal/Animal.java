package OOP.interfaces.animal;

import java.time.LocalDate;

enum FlightsStages implements Trackable{
    GROUNDED,
    LAUNCH,
    CRUISE,
    DATA_COLLECTION;

    @Override
    public void track() {
        if(this!=GROUNDED){
            System.out.println("Monitoring " + this);
        }
    }

    public FlightsStages getNextStage(){
        FlightsStages[] allStages = values();
        return allStages[(ordinal()+1)%allStages.length];
    }
}

record DragonFly(String name,String type) implements FlightEnabled{


    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }


}

class Satallite implements OrbitEarth{

    @Override
    public void achieveOrbit(){
        System.out.println("Orbit acchieved");
    }

    @Override
    public void land(){

    }
    @Override
    public void fly(){

    }
    @Override
    public void takeOff(){

    }
}

interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();


    static void log(String description){
        var today = LocalDate.now();
        System.out.println(today + " " + description);
    }
}
interface FlightEnabled{
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;

    void land();
    void fly();
    void takeOff();
    default FlightsStages transition(FlightsStages stage){
//        System.out.println("trasition not implemented on " + this.getClass().getName());
//        return null;

        FlightsStages nextStage = stage.getNextStage();
        System.out.println("Trsnitioning from " + stage + " to " + nextStage);

        return nextStage;
    }

}

interface Trackable{
    void track();
}


public abstract class Animal {

    public abstract void move();
}
