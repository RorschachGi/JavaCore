package lesson6;

import java.io.IOException;

public class OperatorIf {
    public static void main(String[] args) throws IOException {

        /*int myInt = 15;
        if(myInt < 10){
            System.out.println("Меньше 10");
        }else if(myInt > 20){
            System.out.println("Больше 20");
        }else {
            System.out.println("Между 10 и 20");
        }*/

        char ch, answer = 'B';

        System.out.println("Какая буква загадана?");
        System.out.print("Попробуйте угадать: ");

        ch = (char) System.in.read();

        if(ch == answer){
            System.out.println("Вы угадали");
        }else if(ch > answer){
            System.out.println("Перестарался");
        }
        else {
            System.out.println("Недостарался");
        }

    }
}
