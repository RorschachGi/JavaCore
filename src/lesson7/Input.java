package lesson7;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){

        //Ввод данных
        Scanner s = new Scanner(System.in);

        System.out.print("Введите какой-нибудь текст: ");
        String string = s.nextLine();

        System.out.print("Введите какое-нибудь число: ");
        int digit = s.nextInt();

        System.out.println("Вы ввели текст: " + string);
        System.out.println("Вы ввели число: " + digit);
    }
}
