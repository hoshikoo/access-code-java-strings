package nyc.c4q.hoshikoo.helloworld;

/**
 * Created by Hoshiko on 3/1/15.
 */
public class Numbers {
    public static void main(String[] args) {
        System.out.println(42);
        System.out.println("42");

        System.out.println(42.0);
        System.out.println(42.0000);
        System.out.println("42.0000");
        System.out.println(41.999999999999999);    // fifteen 9's
        System.out.println("41.999999999999999");
        System.out.println();

        System.out.println(17 + 25);
        System.out.println("17" + "25");
        System.out.println("17" + 25);
        System.out.println(17 + "25");
    }
}
