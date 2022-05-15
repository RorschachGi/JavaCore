package lesson41;

public class Test {
    public static void main(String[] args){

        // Мы можем реализовывать сколь угодно интерфейсов, но наследовать можно только от одного класса
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.makeSound();
        dog.makeSound();

        cat.eat();
        dog.eat();

        //Интерфейс - контракт. То, что класс умеет делать, его функционал. То, что должно быть реализовано
        //Абстрактый класс - сущность.



    }
}
