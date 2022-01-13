package Main;


import java.util.Scanner;

public class index {
    public static void main(String[] args) {

        //objetos y atributos

        Scanner sc = new Scanner(System.in);
        RecuestModules recuestModules = new RecuestModules();

        // variables

        int opt;
        int opt2;
        int DimencionMatriz = 0;
        int DimencionMatriz2 = 0;

        int[][] matrizOperacional = new int[0][];
        int[][] matrizOperacional2 = new int[0][];
        int [][] Resultado = new int[0][];


        //introduccion y menu


        System.out.println("hola este programa realiza operaciones con dos matrices! \n" +
                "↓ ↓ ↓");
        System.out.println("Que quieres hacer con tu primera matriz a operar \n" +
                " \n" +
                "1. generar matriz aleatoriamente \n" +
                "2. introducir tu propia matriz \n" +
                " ");
        opt = sc.nextInt();

        //divicion del programa

        // matriz aleatoria
        if (opt == 1) {


            System.out.println("selecione el tamaño de su matriz \n "+
                    "Dimenciones:" +
                    "   1. 2x2" +
                    "   2. 3x3" +
                    "   3. 4x4" +
                    "   4. 5x5" +
                    "   5. 6x6");

            DimencionMatriz = sc.nextInt();

            //obtiene la matriz del usuario y la setea a matrizOperacional
            matrizOperacional = recuestModules.Recuest_user_data_random(DimencionMatriz);
            //Imprime la matriz trabajada
            recuestModules.imprimirMatriz(matrizOperacional);





            System.out.println("Matriz Guardada \n  ");
        }


        //matriz usuario
        if (opt == 2) {
            System.out.println("selecione el tamaño de su matriz \n "+
                    "Dimenciones:" +
                    "   1. 2x2" +
                    "   2. 3x3" +
                    "   3. 4x4" +
                    "   4. 5x5" +
                    "   5. 6x6");

            DimencionMatriz = sc.nextInt();

            //obtiene la matriz del usuario y la setea a matrizOperacional
            matrizOperacional = recuestModules.Recuest_User_data_normal(DimencionMatriz);
            //Imprime la matriz trabajada
            recuestModules.imprimirMatriz(matrizOperacional);

            System.out.println("Matriz Guardada \n  ");
        }

        System.out.println("Ahora ingresa la segunda Matriz: \n" +
                "  " +
                "1. generar matriz aleatoriamente \n" +
                "2. introducir tu propia matriz \n" +
                " ");

        opt2 = sc.nextInt();

        //Matriz aleatoria
        if (opt2 == 1) {



            System.out.println("selecione el tamaño de su matriz \n "+
                    "Dimenciones:" +
                    "   1. 2x2" +
                    "   2. 3x3" +
                    "   3. 4x4" +
                    "   4. 5x5" +
                    "   5. 6x6");

            DimencionMatriz2 = sc.nextInt();


            //obtiene la matriz del usuario y la setea a matrizOperacional
            matrizOperacional2 = recuestModules.Recuest_user_data_random(DimencionMatriz2);
            //Imprime la matriz trabajada
            recuestModules.imprimirMatriz(matrizOperacional2);

            System.out.println("Matriz Guardada");
        }

        //Matriz usuario
        if (opt2 == 2) {

            System.out.println("selecione el tamaño de su matriz \n "+
                    "Dimenciones:" +
                    "   1. 2x2" +
                    "   2. 3x3" +
                    "   3. 4x4" +
                    "   4. 5x5" +
                    "   5. 6x6");

            DimencionMatriz2 = sc.nextInt();

            //obtiene la matriz del usuario y la setea a matrizOperacional
            matrizOperacional2 = recuestModules.Recuest_User_data_normal(DimencionMatriz2);

            //Imprime la matriz trabajada
            recuestModules.imprimirMatriz(matrizOperacional2);

            System.out.println("Matriz Guardada");

        }


        System.out.println("estas son tus dos matrices " +
                "matriz #1 ↓ ↓ ↓");

        recuestModules.imprimirMatriz(matrizOperacional);

        System.out.println("matriz #2 ↓ ↓ ↓");

        recuestModules.imprimirMatriz(matrizOperacional2);

        // Aqui Comienzan las operaciones

        int opt_operaciones = 0;

        boolean Menu_operacional = true;

        while (Menu_operacional){

            System.out.println("Ahora que Quieres hacer con tus matrices?? \n" +
                    " " +
                    "↓ ↓ ↓ \n" +
                    "  \n" +
                    "1. Sumar \n" +
                    "2. Restar \n" +
                    "3. Multiplicar \n" +
                    "4. Dividir \n" +
                    "5. Salir Del Programa ");

            System.out.println("aqui seguiria el siguiente codigo");

            opt_operaciones = sc.nextInt();

            if (opt_operaciones == 1) {

                //Se comprueba que las dos Matrices sean de la misma longitud
                if (DimencionMatriz == DimencionMatriz2) {

                    //sumar

                    Resultado = recuestModules.Sumarmatrices(matrizOperacional,matrizOperacional2);

                    System.out.println("Esta es tu matriz Resultante \n  ");

                    recuestModules.imprimirMatriz(Resultado);

                }
                else {
                    System.out.println("No puedes operar con matrices de diferente tamaño!");

                    Menu_operacional = false;

                }



            }


            if (opt_operaciones == 2) {

                //Se comprueba que las dos Matrices sean de la misma longitud
                if (DimencionMatriz == DimencionMatriz2) {
                    //restar

                    Resultado = recuestModules.Restarmatrices(matrizOperacional,matrizOperacional2);

                    System.out.println("Esta es tu matriz Resultante \n  ");

                    recuestModules.imprimirMatriz(Resultado);
                }
                else {
                    System.out.println("No puedes operar con matrices de diferente tamaño!");
                    Menu_operacional = false;
                }



            }


            if (opt_operaciones == 3) {

                //Se comprueba que las dos Matrices sean de la misma longitud
                if (DimencionMatriz == DimencionMatriz2) {
                    //Multiplicar

                    Resultado = recuestModules.Productomatrices(matrizOperacional,matrizOperacional2);

                    System.out.println("Esta es tu matriz Resultante \n  ");

                }
                else {
                    System.out.println("No puedes operar con matrices de diferente tamaño!");
                    Menu_operacional = false;
                }


                recuestModules.imprimirMatriz(Resultado);

            }

            if (opt_operaciones == 4) {

                //Se comprueba que las dos Matrices sean de la misma longitud
                if (DimencionMatriz == DimencionMatriz2) {

                    //Dividir

                    Resultado = recuestModules.Dividirmatrices(matrizOperacional,matrizOperacional2);

                    System.out.println("Esta es tu matriz Resultante \n  ");

                    recuestModules.imprimirMatriz(Resultado);

                }
                else {
                    System.out.println("No puedes operar con matrices de diferente tamaño!");
                    Menu_operacional = false;
                }



            }

            if (opt_operaciones == 5) {
                Menu_operacional = false;

                System.out.println(" hasta pronto! ツ");
            }

        }




        


    }

}