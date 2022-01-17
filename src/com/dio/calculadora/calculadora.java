package com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		//instancia o objeto scaner ára receber inputs do teclado e as variaveis a e b
		Scanner scan = new Scanner(System. in); 
		double a,b;
		
		//preenche as variaveis a e b com inputs do usuario
		System.out.println("Insira o primeiro valor ");
		a= scan.nextDouble();
		System.out.println("Insira o segundo valor");
		b= scan.nextDouble();
		
		//faz a chamada e print das funções soma, seubtração, multiplicação e divisão
		System.out.println("Soma de " + a + " com " + b + " = "+ soma(a,b));
		System.out.println("Subtração de " + a + " por " + b + " = "+ subtracao(a,b));
		System.out.println("Multiplicação de " + a + " pom " + b + " = "+ multiplicao(a,b));
		System.out.println("Divisão de " + a + " pom " + b + " = "+ divisao(a,b));
		
		scan.close();
	}
	
	
//----------------Faz a soma de a com b-----------------------------------------------	
	public static double soma (double a, double b) {
		return a+b;
	}
	
//----------------Faz a subtração de a por b------------------------------------------	
	public static double subtracao (double a, double b) {
		return a-b;
	}
	
//----------------Faz a multiplicação de a por b---------------------------------------	
	public static double multiplicao (double a, double b) {
		return a*b;
	}
	
//----------------Faz a divisão de a por b---------------------------------------------	
	public static double divisao (double a, double b) {
		return a/b;
	}

}
