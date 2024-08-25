/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 */
public class E04_Final {

    public static void main(String args[]) {
        Car aCar = new Car("ABC950022");

        //aCar.engine=new Engine("XYX950022"); //error! engine is FINAL
        aCar.engine.serialsNum = "XYX950022";

        aCar.move();

    }
}
//Composition: an Engine is a part-of a Car, and if you believe it is completely 
//encapsulated by car, not reusable, or switchable, the relationship between 
//them is Composition. 

class Car {

    public final Engine engine;

    Car(String engNumber) {
        engine = new Engine(engNumber);
    }

    void move() {
        engine.work();
    }
}

//Aggregation: If you think the engine can exist without a car, 
//and it can be swapped, and the outside world can still have a reference 
//to the engine, then you can define the relationship as an aggregation: 
class Engine {

    public String serialsNum;  // not final!!!    

    public Engine(String sn) {
        this.serialsNum = sn;
    }

    public void work() {
        System.out.println("wooof wooof");
    }
}
