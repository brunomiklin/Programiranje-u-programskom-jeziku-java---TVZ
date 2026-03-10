package OOP.interfaces.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Bird bird = new Bird();
        Animal animal = bird;

        Trackable trackable = bird;
        FlightEnabled flier = bird;
        animal.move();
        //flier.move(); -> uvijek gledaš lijevu stranu ono kaj ona ima moreš pozvat!!
        //trackable.move();

//        flier.takeOff();
//        flier.fly();
//        trackable.track();
//        flier.land();


        Jet jet = new Jet();

        inFlight(flier);
        inFlight(jet);
        Trackable truck = new Truck();
        truck.track();


        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled*FlightEnabled.KM_TO_MILES;


        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        fliers.add(bird);


        List<FlightEnabled> betterFliers = new ArrayList<>();
        fliers.add(bird);


        flierMethod(fliers);
        //flierMethod(betterFliers); --> nebreš jer se dolje očekuje List<>, ArrayList implementira List ali List<> ne extenda niti ne može extendat ArrayList

    }
    private static void inFlight(FlightEnabled flier){

        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable trackable){ // flier-a moraš castati u trackable kako bi mogao dohvatiti njegove metode
            trackable.track();
        }
        flier.land();
    }

    public static void flierMethod(ArrayList<FlightEnabled> fliers){
        fliers.forEach(f->f.fly());
    }


}
