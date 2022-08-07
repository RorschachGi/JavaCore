package lesson45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        // Сериализация нужна для записи объектов в файл, чтобы использовать их в будущем. С прекращением программы прекращают существование и объекты, поэтому их можно сохранить.

        // FileOutputStream записывает последовательность байтов. Может записывать, что угодно, а не только объекты.
        // ObjectOutputStream предназначен именно для записи объектов в файлы. Но ему необходимо передать объект FileOutputStream, куда он и запишет объекты в бинарном виде.
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            // Когда используем выходной поток данных - мы должны его закрывать
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
