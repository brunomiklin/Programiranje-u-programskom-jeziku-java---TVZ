package OOP.interfaces.animal;

public class Test {
    static void main() {

             inFlight(new Jet());
             OrbitEarth.log("Testing " + new Satallite());

    }
    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.transition(FlightsStages.LAUNCH);
        flier.fly();
        if(flier instanceof Trackable trackable){ // flier-a moraš castati u trackable kako bi mogao dohvatiti njegove metode
            trackable.track();
        }
        flier.land();
    }

}
