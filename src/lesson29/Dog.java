package lesson29;

public class Dog extends Animal{

    // Переопределение родительского метода
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
