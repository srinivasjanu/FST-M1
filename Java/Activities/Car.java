package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car(){
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics(){
        System.out.println("Car Color is" + color);
        System.out.println("Car transmission is" + transmission);
        System.out.println("Make of a Car is " + make);
        System.out.println("Number of tyres to a car " + tyres);
        System.out.println("Number of doors to a car " + doors);
    }
    public void accelarate(){
        System.out.println("Car is moving forward");
    }
    public void breaks(){
        System.out.println("Car has Stopped");
    }


}
