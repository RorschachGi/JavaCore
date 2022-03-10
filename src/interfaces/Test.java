package interfaces;

public class Test {
    public static void main(String[] args){

        Animal animalOne = new Animal(2);
        Person personOne = new Person("John");


        // Таким образом мы получим доступ только к методам, обозаченным в интерфейсе
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        outputInfo(info1);
        outputInfo(info2);

        // Объекты класса, реализующего интерфейс также обрабатываются
        outputInfo(animalOne);
        outputInfo(personOne);

    }

    public static void outputInfo(Info info){
        info.showInfo();
    }
}
