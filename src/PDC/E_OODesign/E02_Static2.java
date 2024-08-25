/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 * @note Ask yourself: Variable of a class or Variable of an instance of the
 * class? Is it a global variable shared by all the instances of a class? A
 * property that is shared by all the instances of the class should be declared
 * as a static property.
 */
public class E02_Static2 {

    public static void main(String args[]) {
        Person per1 = new Person("Leo", 30);
        Person per2 = new Person("Emily", 25);
        Person per3 = new Person("Mark", 18);
        System.out.println("============= Before Updating City ================");
        System.out.println(per1.getInfo());
        System.out.println(per2.getInfo());
        System.out.println(per3.getInfo());
        System.out.println("============= After Updating City ================");
        Person.city = "City B";
//        Person.salary = 5000;
        System.out.println(per1.getInfo());
        System.out.println(per2.getInfo());
        System.out.println(per3.getInfo());

        System.out.println(per1);
    }
}

class Person {

    private String name;
    private int age;

    //A static field belongs to the class, 
    //it does not change from one instance to the other
    public static String city = "City A";
    public static int salary = 4000;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getInfo() {
        return "Name: " + this.name + ", Age: " + this.age + ", City: " + city + ", Salary: " + salary;
    }

//    @Override
//    public String toString(){
//         return "Name: " + this.name + ", Age: " + this.age + ", City: " + city + ", Salary: " + salary;
//    }
}
