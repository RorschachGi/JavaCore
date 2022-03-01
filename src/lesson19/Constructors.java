package lesson19;

public class Constructors {
    public static void main(String[] args){

        Human humanOne = new Human("Гарри", 16);
        humanOne.getInfo();

        Human humanTwo = new Human();
        humanTwo.getInfo();


    }
}

class Human{

    String name;
    int age;

    // Конструкторы
    // Можно иметь несколько методов с одинаковыми названиями до тех пор, пока отличаются параметры ( перегрузка методов )
    public Human(){
        System.out.println("Привет из первого конструктора");
        this.name = "noname";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " +  age);
    }
}
