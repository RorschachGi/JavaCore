package lesson25;

public class Dog extends Animal {

    public void bark(){
        System.out.println("I am barking");
    }

    // Переопределим метод eat()
    public void eat(){
        System.out.println("Dog is eating");
    }

    // Поля тоже могут наследоваться, но зависит от модификатора доступа
    public void showName(){
        System.out.println(name);
    }
}
