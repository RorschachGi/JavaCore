package lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        List<Animal> listOfAnimals = new ArrayList<>();

        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        test(listOfAnimals);

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        //Несмотря на то, что Dog наcледует от Animal, так сделать нельзя
        //test(listOfDog);
        /*В таком случае мы можем написать List<?>, что будет означать, что мы можем передать туда любой объект, потому что он
        будет восприниматься, как Object, а все объекты в Java наследуются от Objects. Однако тогда мы сможем использовать только
        методы определенные в Object. Если мы хотим получить доступ к методам конкретного класса, то можно написать, например:
        List<? extends Animal>
         */

        test1(listOfDog);

    }

    // Принимает только коллекции с Animal
    private static void test(List<Animal> list){
        for(Animal animal : list){
            System.out.println(animal);
        }
    }

    // Принимает коллекции с Animal, а также со всеми классами наследующими от Animal
    private static void test1(List<? extends Animal> list){
        for(Animal animal : list){
            animal.eat();
        }
    }
}
