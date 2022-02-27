package lesson14_15_16_17_18;

public class ClassesAndObjects {
    public static void main(String[] args){

        Person personOne = new Person();
        personOne.setName("John");
        personOne.setAge(10);
        System.out.println("Выводим значение в main методе: " + personOne.getName());
        System.out.println("Выводим значение в main методе: " + personOne.getAge());
        personOne.speak();

    }
}

class Person{

    //private поле доступно только в пределах этого класса
    private String name;
    private int age;

    // геттеры и сеттеры
    public void setName(String username){
        if(username.isEmpty()){
            System.out.println("Вы ввели пустое имя");
        }else {
            name = username;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if(userAge < 0){
            System.out.println("Число должно быть положительно");
        }else {
            age = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        System.out.println("Меня зовут " + name  + " и мне " + age + " лет");
    }

    void sayHello(){
        System.out.println("Hello!");
    }


}

