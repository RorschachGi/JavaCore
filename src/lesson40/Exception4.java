package lesson40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {
    public static void main(String[] args) {


        /*
        // Каждое исключение можно обрабатывать по-разному. Их может быть множество
        try{
            run();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }*/

        /*
        // Если хотим обрабатывать все исключения одинаково, то можно пистаь так:
        try{
            run();
        }catch (IOException | ParseException e) {
            e.printStackTrace();
        }*/

        // Все исключения наследуют от классa Exception и мы можем его обработать
        try{
            run();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    // метод может выбрасывать несколько исключений
    public static void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
