import java.util.Scanner;

public class Tarea1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        int uno;
        int dos;
        int tres;
        int cuatro;
        int cinco;
        int par = 0;
        int impar = 1;
        int totalpar = 0;
        int totalimpar = 0;
        System.out.println("Bienvenido al ejercicio de numeros pares e impares.Los numeros pares digitados se sumaran y los impares se multiplicarán.");
        System.out.print("Introduzca un numero a la vez y presione enter");
        System.out.println("");
        System.out.print("Primer Numero: ");                                                 
        uno = sc.nextInt();
        System.out.print("Segundo Numero: ");
        dos = sc.nextInt();
        System.out.print("Tercer Numero: ");
        tres = sc.nextInt();
        System.out.print("cuarto Numero: ");
        cuatro = sc.nextInt();
        System.out.print("quinto Numero: ");
        cinco = sc.nextInt();
        if(uno%2==0) {
        	par = uno;
        	totalpar = totalpar + 1;
        	}
        else {
            impar = uno;
            totalimpar = totalimpar +1;}
        if(dos%2==0) {
            par = par + dos;
            totalpar = totalpar + 1;
            }
         else {
        	 impar = impar * dos;
        	 totalimpar = totalimpar +1;
         } 
        if(tres%2==0) {
            par = par + tres;
            totalpar = totalpar + 1;
            }
         else {
        	 impar = impar * tres;
        	 totalimpar = totalimpar +1;
         } 
        if(cuatro%2==0) {
            par = par + cuatro;
            totalpar = totalpar + 1;
            }
         else {
        	 impar = impar * cuatro;
        	 totalimpar = totalimpar +1;
         }
        if(cinco%2==0) {
            par = par + cinco;
            totalpar = totalpar + 1;
            }
         else {
        	 impar = impar *  cinco;
        	 totalimpar = totalimpar +1;
         }
        System.out.println("cantidad de numeros pares digitados: ");
        System.out.print(totalpar);
        System.out.println("");
        System.out.println("cantidad de numeros impares digitados: ");
        System.out.print(totalimpar);
        System.out.println("");
        System.out.println("suma de numeros pares: ");
        System.out.print(par);
        System.out.println("");
        System.out.println("multiplicacion de numeros impares: ");
        System.out.print(impar);
        
	} 
}
