package lesson36;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {


        String separator = File.separator; //Автоматический подбор разделителя. У разных систем он различен
        String path = "C:" + separator + "Users" + separator + "tuman" + separator + "OneDrive" + separator + "Рабочий стол" + separator + "test.txt";

        // Если файл находится в корне проекта, то достаточно вместо пути просто указать его имя
        File file = new File(path);

        // Есть несколько способов считывания данных из файла. Рассмотрим при помози Scanner
        Scanner scanner = new Scanner(file);

        // В файле: "1 2 3 4", а мы хотим присвоить их в int
        String line = scanner.nextLine();
        String[] numbersString = line.split(" "); // в split указываем разделитель
        int[] numbersInt = new int[3];
        int count = 0;

        for(String number : numbersString){
            numbersInt[count++] = Integer.parseInt(number);
        }

        /* В файле:
                  First line
                  Second line
                  Third line
           Cчитываем и выводим в консоль
         */
        /*while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }*/

        // В коцне программы нужно закрывать сканнер, чтобы освобождать ресурсы и закрывать поток
        scanner.close();


    }
}
