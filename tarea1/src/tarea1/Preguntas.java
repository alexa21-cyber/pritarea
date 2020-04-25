package tarea1;
import java.util.Scanner;
public class Preguntas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
  System.out.println("<<<<Ingrese nombre>>>>");
  String nombre=teclado.next();
  System.out.println("<<<<Ingrese edad>>>>");
  int edad=teclado.nextInt();
  System.out.println("<<<<Ingrese el numero del ejercicio>>>>");
  double ejercicio=teclado.nextDouble();
  System.out.println("<<<<Ingrese cantidad de intentos>>>>");
  byte cantidad=teclado.nextByte();
  System.out.println("<<<<Ingrese respuesta >>>>");
  long codigo=teclado.nextLong();
  System.out.println("<<<<Ingrese codigo >>>>");
  float respuesta=teclado.nextFloat();
 
  
  System.out.println("Nombre: "+nombre+" edad: "+edad+" "+"codigo: "+codigo+ "\n -Ejercicio: "+
  ejercicio+ "\n -Respuesta dada: "+respuesta+"\n -Cantidad de intenos: "+cantidad);
  
  
	}

}
