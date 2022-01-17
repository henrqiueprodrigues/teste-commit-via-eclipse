package com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		
		//instancia o objeto scaner �ra receber inputs do teclado e as variaveis a e b
		Scanner scan = new Scanner(System. in); 
		double a,b;
		
		//preenche as variaveis a e b com inputs do usuario
		System.out.println("Insira o primeiro valor ");
		a= scan.nextDouble();
		System.out.println("Insira o segundo valor");
		b= scan.nextDouble();
		
		//faz a chamada e print das fun��es soma, seubtra��o, multiplica��o e divis�o
		System.out.println("Soma de " + a + " com " + b + " = "+ soma(a,b));
		System.out.println("Subtra��o de " + a + " por " + b + " = "+ subtracao(a,b));
		System.out.println("Multiplica��o de " + a + " pom " + b + " = "+ multiplicao(a,b));
		System.out.println("Divis�o de " + a + " pom " + b + " = "+ divisao(a,b));
		
		scan.close();
	}
	
	
//----------------Faz a soma de a com b-----------------------------------------------	
	public static double soma (double a, double b) {
		return a+b;
	}
	
//----------------Faz a subtra��o de a por b------------------------------------------	
	public static double subtracao (double a, double b) {
		return a-b;
	}
	
//----------------Faz a multiplica��o de a por b---------------------------------------	
	public static double multiplicao (double a, double b) {
		return a*b;
	}
	
//----------------Faz a divis�o de a por b---------------------------------------------	
	public static double divisao (double a, double b) {
		return a/b;
	}

}
