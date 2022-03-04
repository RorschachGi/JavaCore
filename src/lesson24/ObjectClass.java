package lesson24;

public class ObjectClass {
    public static void main(String[] args){

        //Любой класс в Java наследуется от класса Object
        String string = new String("Hello");

        Dog dogOne = new Dog("Чарли", 6);

        // Выведет хешкод объекта, использую метод toString() класса Object. В данном случае он используется
        // по умолчанию, как если бы System.out.println(dogOne.toString())
        System.out.println(dogOne);

        // Метод toString() используется для представления объекта в виде строки





    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void voice(){
        System.out.println("Лает");
    }

    // Мы можем переопределить наследуемый метод, полностью повторив его сигнатуру
    public String toString(){
        return name + ", " + age;
    }
}
