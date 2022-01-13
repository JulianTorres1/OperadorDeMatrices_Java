package Main;

import java.util.Scanner;

public class RecuestModules {
    int[][] Dimencion_normal;

    int[][] Recuest_User_data_normal(int Dimencion_normal){
        Scanner sc = new Scanner(System.in);

        int T1 = 0;
        int T2 = 0;


        if (Dimencion_normal == 1) {
            T1 = 2;
            T2 = 2;

        }
        if (Dimencion_normal == 2) {
            T1 = 3;
            T2 = 3;

        }
        if (Dimencion_normal == 3) {
            T1 = 4;
            T2 = 4;

        }
        if (Dimencion_normal == 4) {
            T1 = 5;
            T2 = 5;

        }
        if (Dimencion_normal == 5) {
            T1 = 6;
            T2 = 6;

        }

        int[][] matriz = new int[T1][T2];



        System.out.println("por favor rellene su matriz");

        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {

                System.out.println("introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = sc.nextInt();
                System.out.println("[" + x + "," + y + "] = " + matriz[x][y]);



            }

        }
        System.out.println("La matrix introducida fue: \n" +
                " " +
                " ");

        return matriz;






    }

    public void imprimirMatriz(int[][] matrizp){
        //imprimir matriz

        for (int i = 0; i < matrizp.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < matrizp[i].length; j++) { //this equals to the column in each row.
                System.out.print(matrizp[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
    }

    int[][] Recuest_user_data_random(int Dimencion_ramdom){
        Scanner sc = new Scanner(System.in);


        int T1 = 0;
        int T2 = 0;



        if (Dimencion_ramdom == 1) {
            T1 = 2;
            T2 = 2;


        }
        if (Dimencion_ramdom == 2) {
            T1 = 3;
            T2 = 3;


        }
        if (Dimencion_ramdom == 3) {
            T1 = 4;
            T2 = 4;


        }
        if (Dimencion_ramdom == 4) {
            T1 = 5;
            T2 = 5;


        }
        if (Dimencion_ramdom == 5) {
            T1 = 6;
            T2 = 6;


        }

        int[][] matriz = new int[T1][T2];


        //generar matriz

        System.out.println("Generando Matriz");
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random()*9+1);
            }
        }

        return matriz;

    }

    // Modulos operacionales

    int[][] Sumarmatrices (int[][] M1, int[][] M2){

        int[][] Matrizresultante = new int[M1.length][M1[0].length];

        for (int x=0; x < M1.length; x++) {
            for (int y=0; y < M1[x].length; y++) {
                Matrizresultante[x][y]=M1[x][y]+M2[x][y];
            }
        }



        return Matrizresultante;
    }


    int[][] Restarmatrices (int[][] M1, int[][] M2){

        int[][] Matrizresultante = new int[M1.length][M1[0].length];

        for (int x=0; x < M1.length; x++) {
            for (int y=0; y < M1[x].length; y++) {
                Matrizresultante[x][y]=M1[x][y]-M2[x][y];
            }
        }


        return Matrizresultante;
    }

    int[][] Productomatrices (int[][] M1, int[][] M2){

        int[][] Matrizresultante = new int[M1.length][M1[0].length];

        for (int x=0; x < M1.length; x++) {
            for (int y=0; y < M1[x].length; y++) {
                Matrizresultante[x][y]=M1[x][y]*M2[x][y];
            }
        }


        return Matrizresultante;
    }

    int[][] Dividirmatrices (int[][] M1, int[][] M2){

        int[][] Matrizresultante = new int[M1.length][M1[0].length];

        for (int x=0; x < M1.length; x++) {
            for (int y=0; y < M1[x].length; y++) {
                Matrizresultante[x][y]=M1[x][y]/M2[x][y];
            }
        }


        return Matrizresultante;
    }





}


