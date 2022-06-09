package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExercicioWhile01 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		int idade=0, totalPessoasMenos21=0, totalPessoasMais50=0, totalPessoas=0;
		
		
		System.out.println("Para parar o programa, digite -99 para idade.");
		
		while( idade != -99) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<=20 && idade != -99 ) {
				 totalPessoasMenos21++;
			}
			
			if(idade > 50) {
				totalPessoasMais50++;
			}
			
			
		}
		System.out.println("O total pessoas - 21: " + totalPessoasMenos21);
		System.out.println("Total de pessoas + 50 = " + totalPessoasMais50);
		
	}
	}
		
		
		

	

