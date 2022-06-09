package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExercicioDoWhile01 {

	/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados. */
	

public static void main(String[] args) {
	
	Scanner leia= new Scanner (System.in);
	
	int numero , soma = 0;
	
	System.out.println("Digite um número do teclado , ou 0 para sair .");
	
	do {
		
		System.out.println("Digite um  número: ");
		numero = leia.nextInt();
		soma += numero;
		}while( numero!=0);
	
	System.out.println("A soma dos números é: " + soma);
	
}

}
	


