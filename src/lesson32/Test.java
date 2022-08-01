package lesson32;

public class Test {
    public static void main(String[] Args){

        // Upcasting - Восходящее преобразование ( Dog ниже в иерархии наследования )
        //Animal animal = new Dog();

        //Downcasting - Нисходящее преобразивание (неявно не работает)
        //Dog dog2 = (Dog) animal;

        //dog2.bark();

        Animal a = new Animal();
        Dog dog = (Dog) a;



    }
}
