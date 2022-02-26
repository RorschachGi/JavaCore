package lesson14_15;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person personOne = new Person();
        personOne.age = 23;
        personOne.name = "Gregor";
        personOne.speak();

        Person personTwo = new Person();
        personTwo.age = 50;
        personTwo.name = "John";
        personTwo.sayHello();
    }
}

class Person{
    /* У класса могут быть:
       1. Данные (поля)
       2. Действия, которые он может выполнять ( Методы )
     */
    String name;
    int age;

    void speak(){
        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
    }

    void sayHello(){
        System.out.println("Hello!");
    }


}

