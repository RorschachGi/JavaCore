package lesson28.packageOne;

public class Person {
     private String name;


     // Константы можно делать public
     public final static String CONSTANT = "CONSTANT";

     protected String login;

     public Person(){
         this.login = "Bob";
     }
}
