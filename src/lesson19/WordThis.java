package lesson19;

public class WordThis {
    public static void main(String[] args){

        Human humanOne = new Human();
        humanOne.setAge(18);
        humanOne.setName("John");
        humanOne.getInfo();

        Human humanTwo = new Human();
        humanTwo.setAge(32);
        humanTwo.setName("Bob");
        humanTwo.getInfo();
    }
}

class Human{
    String name;
    int age;

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
