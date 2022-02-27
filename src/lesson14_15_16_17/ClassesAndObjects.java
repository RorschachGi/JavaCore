package lesson14_15_16_17;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person personOne = new Person();
        personOne.setNameAndAge("Albert", 23);
        personOne.speak();


        Person personTwo = new Person();
        String s1 = "John";
        int uAge = 50;
        personTwo.setNameAndAge(s1, uAge);
        personTwo.speak();


        Person personThree = new Person();
        personThree.setNameAndAge("Bob", 10);
        personThree.speak();

    }
}

class Person{
    /* У класса могут быть:
       1. Данные (поля)
       2. Действия, которые он может выполнять ( Методы )
     */
    String name;
    int age;

    void setNameAndAge(String username, int userAge){
        name = username;
        age = userAge;
    }

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

