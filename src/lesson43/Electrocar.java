package lesson43;


/* Есть три типа вложенных классов в Java
    1) Нестатический вложенный класс
    2) Вложенный статический класс
    3) Вложенный классы в методах
     */

public class Electrocar {

    private int id;

    //Вложенный нестатический класс. Имеет доступ к полям объекта. Обычно используются с модификаторами private и внутри самого класса
    //Вложенные нестатические классы используются, если объект класса сложный, комплексный и его можно разделить на несколько подъобектов.
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id + " is starting...");
        }
    }

    //Вложенный статический класс. Не имеет доступа к полям класса в котором находится, только к статическим. Обычно public.
    // Обычно используются не внутри класса, а извне.
    public static class Battery{
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }

    public void start(){
        Motor motor = new Motor();
        motor.startMotor();

        final int X = 1;

        // Вложенный класс в методе. Имеет доступ к полям класса в котором находится и к переменным метода в котором находится ( должны быть константами ).
        class SomeClass{
            public void someMethod(){
                System.out.println(X);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar " + id + " is starting...");
    }

}
