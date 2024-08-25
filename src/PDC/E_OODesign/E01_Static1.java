/*
 * The programs are designed for PDC paper
 */
package PDC.E_OODesign;

/**
 *
 * @author Quan Bai and Weihua Li
 * @Note We normally do not call the static method/variable using
 * instance.staticMethod/variable,instead we use Class.staticMethod/variable.
 * Please noted that below is just an example to demonstrate the feature of
 * static variables
 */
public class E01_Static1 {

    public static void main(String args[]) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();
        count1.num++;
        count2.num++;
        count3.num++;

        System.out.println(count1.num);
        System.out.println(count2.num);
        System.out.println(count3.num);

        System.out.println(Count.num);

    }
}

class Count {

    //static variable (class variable) shared by all objects of the class
    public static int num = 0;
}
