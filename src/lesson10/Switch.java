package lesson10;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        switch (age) {
            case 0 -> System.out.println("Ты родился");
            case 7 -> System.out.println("Ты пошел в школу");
            case 18 -> System.out.println("Ты закончил школу");
            default -> System.out.println("Ни одно из условий не подошло");
        }

    }
}
