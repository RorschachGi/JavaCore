package lesson41;

import com.sun.source.util.SourcePositions;

import java.util.SortedSet;

public abstract class Animal {

    public void eat(){
        System.out.println("I am eating...");
    }

    // Абстрактный метод не имеет реализации, но должен быть реализован в классах, наследующих от абстрактного
    public abstract void makeSound();
}
