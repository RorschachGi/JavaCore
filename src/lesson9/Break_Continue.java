package lesson9;

public class Break_Continue {
    public static void main(String[] args){

        int j = 0;
        while(true){
            System.out.println(j);
            if(j == 10) break;
            j++;
        }
        System.out.println("Мы вышли из цикла");

        for(int i = 0; i <= 15; i++){
            if(i%2 ==0) continue;
            System.out.println(i + " нечетное");
        }
    }
}
