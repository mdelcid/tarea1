package myproject;

import java.util.Scanner;

public class myclass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Ficha Personal");
		
		Scanner mi_scanner = new Scanner(System.in);
		String str;
		System.out.println("Ingrese nombre: ");
		str = mi_scanner.next();
		
		int edad;
		 System.out.println("Ingrese edad: ");
		 edad = mi_scanner.nextInt();
		 
		 char letra;
		 System.out.println("Ingrese sexo: ");
		 letra = mi_scanner.next().charAt(0);
		 
		 boolean bool;
		 System.out.println("Ingrese casado: ");
		 bool = mi_scanner.nextBoolean();
		 
	}

}
