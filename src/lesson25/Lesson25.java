package lesson25;

public class Lesson25 {
    public static void main(String[] args){

        Animal animal = new Animal();
        animal.eat();

        // Теперь нам доступны методы родителя ( Animal )
        Dog dog = new Dog();
        dog.sleep();
        // И также методы непосредетсвенно класса Dog
        dog.bark();
        // Можно переопределить наследуемый от Animal метод
        dog.eat();
        dog.showName();
    }
}
