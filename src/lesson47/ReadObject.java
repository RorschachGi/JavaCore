package lesson47;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args){

        // Можно организовать закрытие потока автоматически использовав try with resources и прописав открытие потока в нем, зароет он его автоматически
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            //FileInputStream fis = new FileInputStream("people.bin");
            //ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();

            System.out.println(person1);

            //ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }


    }


}
