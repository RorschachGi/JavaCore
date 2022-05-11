package lesson39;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args){
        // Все исключения делятся на два большие типа:
        // Checked Exception ( Compile time exception ) - возникают во время компиляции - исключительные случаи в работе программы
        // Unchecked Exception ( Runtime exception ) - возникают во время выполнения программы - ошибка в работа программы. Их нужно исправлять

        File file = new File("test");

        /* Checked Exception пример
        try {
            Scanner scanner = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println("Такого файла нет");
        }*/


        /* Unchecked Exception примеры. Имеет смысл Unchecked Exception, а не обрабатывать его
        int a = 1 / 0;

        String name = null;
        name.length();

        int[] arr = new int[2];
        System.out.println(arr[2]); */

    }
}
