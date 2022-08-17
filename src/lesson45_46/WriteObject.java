package lesson45_46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {


        // Массив объектов класса Person. Попробуем записать его. Есть два метода
        Person[] personPeople = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom") };

        // Сериализация нужна для записи объектов в файл, чтобы использовать их в будущем. С прекращением программы прекращают существование и объекты, поэтому их можно сохранить.

        // FileOutputStream записывает последовательность байтов. Может записывать, что угодно, а не только объекты.
        // ObjectOutputStream предназначен именно для записи объектов в файлы. Но ему необходимо передать объект FileOutputStream, куда он и запишет объекты в бинарном виде.
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Метод 1: Первый метод заключается в том, чтобы сначала записать числом размер массива, затем циклом поочередно записать все объекты массива.
            /*oos.writeInt(personPeople.length);

            for(Person person : personPeople){
                oos.writeObject(person);
            }*/

            // Метод 2: Второй способ заключается в том, чтобы записать не все объекты поочередно, а сразу весь массив, поскольку он тоже является объектом
            oos.writeObject(personPeople);

            // Когда используем выходной поток данных - мы должны его закрывать
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
