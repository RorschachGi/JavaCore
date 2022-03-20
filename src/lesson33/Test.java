package lesson33;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        // До Java 5
        // Объект класса List хранит в себе Object
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();

        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        // Для извлечения нужен Downcasting
        String animal = (String) animals.get(0);

        // После появления дженериков
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1);


        // В Java 7 можно оставлять вторые <> пустыми
        List<String> animals3 = new ArrayList<>();


    }

}

class Animal{

}
