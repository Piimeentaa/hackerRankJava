package br.com.exercicios;

import java.util.Scanner;

public class AprendendoCoisas {
	
	

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		String fraseEntrada  = ""; //armazena a frase
		String fraseInvertida = ""; // coloca a frase ao contrario
		
		System.out.println("Digite a palavra");
		fraseEntrada = scanner.next();
		scanner.close();
		fraseEntrada = fraseEntrada.trim();
		
		for(int i= fraseEntrada.length()-1; i >=0; --i ) {
			fraseInvertida += fraseEntrada.charAt(i);
			//inverte a entrada
		}
		if(fraseEntrada.equalsIgnoreCase(fraseInvertida))
		{
			System.out.println("Palíndromo");
		
			
		}else {
			System.out.println("não é Palíndromo");
		}
	
		


	}
		
}
