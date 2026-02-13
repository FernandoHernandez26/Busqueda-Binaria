package actividad;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int numero;
		int resultado;
		int [] numbus = {1,3,5,7,9,10,15,20,30,50,100};
		
		System.out.println("---Hola bienvenido---");
		System.out.println("\nEscribe el número a buscar:");	
		   numero = leer.nextInt();
		   
		   
		  Busqueda buscando = new Busqueda (); 
		  	resultado = buscando.buscar(numbus, numero);
		  
		  if (resultado !=-1) {
			  System.out.println("El numero que buscas esta en el indice numero " + resultado);
			  
		  }else System.out.println("El número no esta en ningun indice");
		 
		  leer.close();
		
		
	}

}
///