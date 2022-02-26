package lesson14_15_16;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person personOne = new Person();
        personOne.age = 23;
        personOne.name = "Gregor";
        personOne.speak();
        int yearOne = personOne.calculateYearsToRetirement();

        Person personTwo = new Person();
        personTwo.age = 50;
        personTwo.name = "John";
        personOne.speak();
        int yeatTwo = personTwo.calculateYearsToRetirement();

        System.out.println("Первому человеку до пенсии " + yearOne + " , а второму " + yeatTwo);
    }
}

class Person{
    /* У класса могут быть:
       1. Данные (поля)
       2. Действия, которые он может выполнять ( Методы )
     */
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("Меня зовут " + name + " и мне " + age + " лет");
    }

    void sayHello(){
        System.out.println("Hello!");
    }


}

