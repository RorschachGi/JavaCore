package lesson13;

public class Multidimensional_arrays {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3}; // Одномерный массив

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Двумерный массив

        //System.out.println(matrice[2][2]);

        String[][] strings = new String[2][3];
        strings[0][1] = "Car";
        System.out.println(strings[0][1]);

        // Вывод двумерного массива
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice.length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
}
