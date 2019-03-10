package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle(); //Instanciando um objeto
		y = new Triangle(); //Instanciando um objeto
		
		System.out.println("Digite as medidas do triângulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		
		System.out.println("Digite as medidas do triângulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		
		
		x.area();
		
		
		y.area();
		
		System.out.printf("Area X: %.4f%n",  x.area());
		System.out.printf("Area Y: %.4f%n", y.area());
		
		if(x.area() > y.area()) {
			System.out.println("Area maior: X");
		}else {
			System.out.println("Area maior: Y");
		}
		
		
		scan.close();
	}
}
