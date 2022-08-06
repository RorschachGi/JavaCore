package lesson44;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        File file = new File("testFileTwo");

        // Для записи в файл используем класс PrintWriter
        PrintWriter pw = new PrintWriter(file);

        pw.println("String row 1");

        // После окончания записи в файл нужно закрыть
        pw.close();
    }
}
