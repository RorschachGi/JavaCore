package lesson5;

import java.io.IOException;

public class ForLoop {
    public static void main(String[] args) throws IOException {

        for(int i = 0; i <= 10; i++){
            System.out.println("Итерация " + i);
        }

        System.out.println("________________________________");

        //Обратный
        for(int i = 10; i >= 0; i--){
            System.out.println("Итерация " + i);
        }

        //Условия могут быть разными
        for(int i = 0; (char) System.in.read() != 'S'; i++){
            System.out.println("Итерация " + i);
        }
    }
}
