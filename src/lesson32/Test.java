package lesson32;

public class Test {
    public static void main(String[] Args){

        // Upcasting - Восходящее преобразование ( Dog ниже в иерархии наследования )
        //Animal animal = new Dog();


        //Downcasting - Нисходящее преобразивание (неявно не работает)
        //Dog dog2 = (Dog) animal;

        Animal a = new Animal();
        Dog dog = (Dog) a;



    }
}
