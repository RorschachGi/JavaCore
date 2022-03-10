package interfaces;

// Класс может реализовывать любое количество интерфейсов, но наследовать только один класс
public class Animal implements Info {

    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I`m sleeping");
    }

    public void showInfo(){
        System.out.println("Id is " + this.id);
    }
}
