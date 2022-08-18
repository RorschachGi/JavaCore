package lesson48;

public enum Animal {

    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String tranlation;

    //Конструктор по умолчанию
    Animal(){

    }

    //Обычно конструкторы в enum делаются приватными
    private Animal(String translation){

        this.tranlation = translation;

    }

    public String getTranlation(){
        return tranlation;
    }

    public String toString(){
        return "Перевод на русский язык" +  tranlation;
    }
}
