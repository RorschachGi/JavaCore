package lesson29;

public class Test {
    public static void main(String[] args){

        // Можем ссылаться на наследника через родительский, но будет доступен только функционал родителя
        Animal animal = new Dog();
        //animal.bark() - не сработает


        // Позднее связывание - вызовется тот метод, что определен в потомке, если таковой имеется
        animal.eat();

        Dog dog = new Dog();
        dog.bark();

        Animal animalAll = new Animal();
        Dog dog1 = new Dog();
        Cat cat = new Cat();


        // Можем вызвать метод у всех объектов, наследуюмых от Animal
        test(animalAll);
        test(dog1);
        test(cat);

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
