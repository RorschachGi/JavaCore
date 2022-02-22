package lesson8;

import java.io.IOException;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        // Работает, пока не введено 5. Проблема в дублировании кода
        /*
        int value = scanner.nextInt();
        while(value != 5){
            System.out.println(value);
            value = scanner.nextInt();
        }*/

        // Та же задача при помощи do while без дублирования
        /*int value;
        do{
            System.out.println("Введи 5");
            value = scanner.nextInt();
        }while(value != 5);*/

        int count = scanner.nextInt();
        while(count != 0){
            if(count%2 == 0){
                System.out.println(count + " четное");
                count--;
            }else{
                System.out.println(count + " нечетное");
                count--;
            }
        }





    }
}
