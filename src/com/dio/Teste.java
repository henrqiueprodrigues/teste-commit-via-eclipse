package com.dio;

import com.dio.model.Gato;

public class Teste {

	public static void main(String[] args) {
		Gato gato = new Gato("felix", "preto", 6);
		Livros livro = new Livros("pequeno principe", 160);
		int a= 2;
		int b =3;
		System.out.println("Hello World" + a+b);
		System.out.println(gato);
		System.out.println(livro);

	}

}

class Livros{
	private String nome;
	private Integer paginas;
	
	public Livros(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}
	
}
