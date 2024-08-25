/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 */
public class E06_HideMethod {

    public static void main(String args[]) {

        Animal myAnimal = new Cat();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();

//        Animal animal = new Animal();
//        Cat cat = new Cat();
//        
//        animal.testClassMethod(); 
//        cat.testClassMethod(); 
    }
}

class Animal {

    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}

class Cat extends Animal {

    //Hide the static method, not override
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

}
