package MultiplicacionesMatrices4a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MultiplicacionesMatrices4a {

    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static int[][] leerMatriz(int filas, int columnas, char nombre) throws IOException {
        int[][] matriz = new int[filas][columnas];

        System.out.println("Lectura de datos de la matriz "+nombre);
        for (int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.println("Escribe valor de " +nombre+ "[" +i+ "][" +j+"]: ");
                entrada = bufer.readLine();
                matriz[i][j] = Integer.parseInt(entrada);
            }
        }
        return matriz;
    }

    public static int[][] multiplicarMatriz(int[][] a, int [][] b){
        int[][] c = new int[a.length][b[0].length];
        for ( int i = 0; i < a.length; i++){
            for ( int j = 0; j < b[0].length; j++){
                for ( int k = 0; k < a[0].length; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void imprimirMatriz(int[][] matriz, char nombre){
        System.out.println("Contenido de la matriz "+nombre);
        for ( int i = 0; i < matriz.length; i++){
            for ( int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }
    }

    //usando for extendido
    public static void imprimirMatriz2(int[][] matriz, char nombre) {
        System.out.println("Contenido de la matriz "+nombre);

        for (int[] unaFila : matriz ){
            for ( int unElemento : unaFila ){
                System.out.print(unElemento + "   ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        int[][] a, b, c;
        int r1,c1,r2,c2;

        System.out.println("Programa que multiplica matrices");
        System.out.println("Escribe el total de la matriz a: ");
        entrada = bufer.readLine();
        r1 = Integer.parseInt(entrada);
        System.out.println("");
        System.out.println("Escribe el total de la matriz a: ");
        entrada = bufer.readLine();
        c1 = Integer.parseInt(entrada);

        System.out.println("Escribe el total de la matriz a: ");
        entrada = bufer.readLine();
        r2 = Integer.parseInt(entrada);
        System.out.println("");
        System.out.println("Escribe el total de la matriz a: ");
        entrada = bufer.readLine();
        c2 = Integer.parseInt(entrada);

        if(c1 == r2){
            a = leerMatriz(r1,c1, 'a');
            b = leerMatriz(r2,c2, 'b');

            c = multiplicarMatriz(a,b);

            System.out.println(" --- Resultados --- ");
            System.out.println("Matriz a: ");
            imprimirMatriz(a, 'a');
            System.out.println("Matriz b: ");
            imprimirMatriz(b, 'b');
            System.out.println("Matriz c: ");
            imprimirMatriz(c, 'b');
        }
        else {
            System.out.println("No se puede multiplicar");}
    }
}