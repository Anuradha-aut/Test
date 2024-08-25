/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 * @Note You want to have variables that are common to all objects. This is
 * accomplished with the static modifier. Suppose you want to create a number of
 * Bicycle objects and assign each a serial number, beginning with 1 for the
 * first object. This ID number is unique to each object and is therefore an
 * instance variable. At the same time, you need a field to keep track of how
 * many Bicycle objects have been created so that you know what ID to assign to
 * the next one. Such a field is not related to any individual object, but to
 * the class as a whole. For this you need a class variable, numberOfBicycles
 * @Note We shouldn't use constructors to initialize Static field, since static
 * fields are not something associated with any instance of a class, but it is
 * bound to the class. There is only a single copy of that variable, which is
 * accessed by all the instances. So, if you are initializing it in constructor,
 * then every time you create an instance, that field will be re-initialized for
 * every other instance
 */
public class E03_Static3 {

    public static void main(String args[]) {
        System.out.println(new Bicycle(1, 12, 3));
        System.out.println(new Bicycle(3, 12, 1));
        System.out.println(new Bicycle(5, 10, 9));
        System.out.println(new Bicycle(11, 19, 4));
        System.out.println(new Bicycle(13, 13, 8));

    }
}

class Bicycle {

    private int cadence;
    private int gear;
    private int speed;
    private int id;
    //private static variable, only can be accessed internally
    private static int numberOfBicycles = 0;

    //You should use static initializer block to initialize your static fields, or just initialize them at the place of declaration.
//    static{
//        numberOfBicycles = 10; 
//    }
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }

    // new method to return the ID instance variable
    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Bicycle ID: " + this.id + ", gear: " + this.gear
                + ", cadence: " + this.cadence + ", speed: "
                + this.speed + ". Total Number of Bicycles: "
                + Bicycle.numberOfBicycles;
    }

}
