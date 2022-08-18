package lesson47;

import java.io.*;

public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(1, "Mike");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            //FileOutputStream fos = new FileOutputStream("people.bin");
            //ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
