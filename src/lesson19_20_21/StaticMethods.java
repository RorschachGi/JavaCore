package lesson19_20_21;

public class StaticMethods {
    public static void main(String[] args){

        Human humanTest = new Human("Bob", 28);
        Human humanTest2 = new Human("John", 86);

        Human.printNumberOfPeople();

    }
}

// Статический метод работает только со статическими переменными

class Human{

    private String name;
    private int age;

    private static int countPeople;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printAllFields(){
        System.out.println(name + " " + age + " " + countPeople);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static void printNumberOfPeople(){
        System.out.println(countPeople);
    }

}
