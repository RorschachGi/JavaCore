package testing;

import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException, IllegalMonitorStateException {

        System.out.println("hi test");

        int numberOne = 10;

        double numberTwo = 9.8;

        boolean check = true;

        String string = new String("My name is Ivan");

        String str = "new string";

        System.out.println(string);

        /*Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        switch (age){
            case 5 :
                System.out.println("5 years");
                break;
            default:
                System.out.println("no 5 years");
        }*/

        int[] arrayOfNumbers = {1, 2, 3, 4};



        for(int integer : arrayOfNumbers){
            System.out.println(integer);
        }

        StringBuilder sb = new StringBuilder("Overlord");


        System.out.println(sb);

        int x = 10;

        String str1 = String.valueOf(x);

        //String stringTwo = scanner.nextLine();
        //System.out.println(stringTwo);



    }
}
