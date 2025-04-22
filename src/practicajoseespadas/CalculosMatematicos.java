package practicajoseespadas;

import java.util.ArrayList;

public class CalculosMatematicos {

     public CalculosMatematicos() {
     }

     public void calculosRefactorizados(int numero) {

	  // Generamos el array de primos
	  ArrayList<Integer> miArray = generarArrayPrimos(numero);

	  System.out.println("Los factoriales primos del número introducido son: " + miArray);
     }
     
     // Método para comprobar si un número es primo
     private static boolean primo(int numero){
	  boolean flag = true;
	  for(int x = 2; x < numero; x++){
	       if(numero % x == 0){
		    flag = false;
	       }
	  }
	  return flag;
     }
     
     // Metodo para comprobar si un numero es primo y sacarlo por consola
     private void esPrimo(int numero){
	  if(primo(numero)){
	       System.out.println("El número " + numero + " SI es primo");
	  } else {
	       System.out.println("El número " + numero + " NO es primo");
	  }
     }
     
     // Método para generar un array de numeros primos
     private static ArrayList<Integer> generarArrayPrimos(int numero){
	  // Instanciamos el array a devolver
	  ArrayList<Integer> miArray = new ArrayList();
	  
	  // Añadimos el 1 (siempre va a existir en el array)
	  miArray.add(1);
	  
	  // Iteramos por todos los numeros
	  for (int x = 2; x < numero; x++){
	       if(primo(x)){
		    miArray.add(x);
	       }
	  }
	  
	  // Retornamos el array completo solo de numeros primos
	  return miArray;
     }
}
