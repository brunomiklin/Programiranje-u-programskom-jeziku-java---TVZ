package KlaseIObjekti.opcenito;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void setMake(String make){
        if(make==null) make = "Unknown";
        make = make.toLowerCase();
        switch (make){
            case "tesla","porsche","holden" -> this.make=make;
            default -> {
                this.make = "Unsuportted";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getMake(){
        return this.make;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getDoors(){
        return this.doors;
    }
    public boolean isConvertible(){
        return this.convertible;
    }

    public void describeCar(){


        System.out.println("Car{" +
                "make=' " + make + '\'' +
                ", model= '" + model + '\'' +
                ", color=' " + color + '\'' +
                ", doors= " + doors +
                (convertible ? " convertible" : " not convertible"));

    }


}
