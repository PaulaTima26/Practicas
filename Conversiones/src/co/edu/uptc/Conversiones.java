package co.edu.uptc;

import java.util.Scanner;

/*Name: Paula Estefania Timaran Amezquita 
 * Date: 1/10/2025
 * Description= Conversiones entre tipos de datos 
 */
public class Conversiones {
	//Variables Globales 
	
	private int edad;
	private String nombre; 
	private Scanner read; 
	
	// Metodo constructor 
public Conversiones() {
	edad=0; 
	nombre= "";
	read= new Scanner (System.in);
}
//Metodos propios 
public void ejemploUno() {
	System.out.println("Ingresa tu codigo por favor");
	nombre=read.nextLine();
	edad=Integer.parseInt(nombre);
	System.out.println(edad+1);
}
public void ejemploDos() {
	System.out.println("Ingresa tu edad por favor");
	edad=read.nextInt(); 
	nombre=String.valueOf(edad);
	System.out.println(nombre+" "+ 1);
}
	public static void main(String[] args) {
		Conversiones ejecutar=new Conversiones();
		ejecutar.ejemploUno();
		ejecutar.ejemploDos();
	}

}
