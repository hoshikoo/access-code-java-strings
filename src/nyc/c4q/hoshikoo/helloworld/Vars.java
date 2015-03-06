package nyc.c4q.hoshikoo.helloworld;

/**
 * Created by Hoshiko on 3/3/15.
 */
public class Vars {

    public static void main( String[] args )
    {
        boolean isEven = 10%3==0;
        System.out.println(isEven);
        System.out.println(30%8);
        System.out.println( "Is it greater or equal? " + ( -5 == -2 ) );
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );

        int myAge, myAgeFive;
        myAge= 5;
        myAgeFive = myAge+5;
        System.out.println("Today, I am "+myAge+" years old. In 5 years, I will be "+myAgeFive+" years old.");

    }
}
