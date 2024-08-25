/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 */
public class E05_NoArgConstructor2 {

    public static void main(String args[]) {
        Bike bike = new Bike("New Bike");

    }
}

class Vehicle {

    String vehicleName;
    int vehicleSpeed;

    public Vehicle(String vehicleName, int vehicleSpeed) {
        this.vehicleName = vehicleName;
        this.vehicleSpeed = vehicleSpeed;
    }

    //what happens if this is missing? 
    public Vehicle() {
        System.out.println("Parent's empty constructor is called!");
    }
}

class Bike extends Vehicle {

    int gear;
    int cadence;
    int speed;

    public Bike(String name) {
        System.out.println("Bike's constructor is called!");
        gear = 1;
        cadence = 10;
        speed = 0;
    }
}
