package lesson14;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person personOne = new Person();
        personOne.age = 23;
        personOne.name = "Gregor";

        System.out.println("Меня зовут " + personOne.name + " и мне " + personOne.age + " лет");

        Person personTwo = new Person();
        personTwo.age = 50;
        personTwo.name = "John";

        System.out.println("Меня зовут " + personTwo.name + " и мне " + personTwo.age + " лет");
    }
}

class Person{
    /* У класса могут быть:
       1. Данные (поля)
       2. Действия, которые он может выполнять ( Методы )
     */
    String name;
    int age;
}
