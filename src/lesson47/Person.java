package lesson47;

import java.io.Serializable;

public class Person implements Serializable {

    private transient int id;

    // Бывают случаи, когда мы не хотим сериализовывать определенно поле, допустим name. В таком случае мы указываем ключевое слово transient
    private String name;



    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return id + " : " + name;
    }

}
