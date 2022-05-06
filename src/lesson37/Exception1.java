package lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {

    public static void main(String[] args) {

        /*File file = new File("asfsaf");

        // Весь код, который может вызвать исключение находится в try, а его обработка в catch
        // Как только обнаруживается исключение в блоке try, то программа сразу переключается на catch, остатки кода в try игнорируются
        try {
            Scanner scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("Такого файла нет");
            //e.printStackTrace();
        }

        System.out.println("После блока try catch код выполняется дальше");*/

        try{
            readFile();
        } catch (FileNotFoundException e){
            System.out.println("Обработка исключения в методе main");
        }



    }

    public static void readFile() throws FileNotFoundException{
        File file = new File("asfsaf");
        Scanner scanner = new Scanner(file);

    }
}
