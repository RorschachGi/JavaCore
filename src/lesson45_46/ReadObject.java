package lesson45_46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args){

        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Изначально возвращает Object, поэтому нужно сделать нисходящее приведение
            //Person person1 = (Person) ois.readObject();
            //Person person2 = (Person) ois.readObject();

            //System.out.println(person1.toString());
            //System.out.println(person2.toString());

            // Метод 1: Поочередно считаем все записанные объекты в новый массив
            /*int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for(int i = 0; i < personCount; i++){
                people[i] = (Person)ois.readObject();
            }*/

            // Метод 2: Cчитываем сразу весь массив
            Person[] people = (Person[])ois.readObject();

            System.out.println(Arrays.toString(people));

            ois.close();
        }  catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
