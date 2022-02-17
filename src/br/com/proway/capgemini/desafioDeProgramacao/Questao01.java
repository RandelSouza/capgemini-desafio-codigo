package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Scanner;

/**
 * <b>Descrição da questão:</b> Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
 * e espaços. <br/>
 * A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class Questao01 {
		
	/**
	 *  Método responsável por imprimir uma linha com espaços em branco e o * representando os degraus
	 * @param tamanho tipo inteiro, tamanho da escada base e altura
	 * @param nDegraus tipo inteiro, número de degraus em cada linha
	 */
	public static void imprimirLinha(int tamanho, int nDegraus) {
		int nEspacos = tamanho - nDegraus;
		
		for(; nEspacos > 0; nEspacos--) {
			System.out.print(" ");
		}
		
		for(; nDegraus > 0; nDegraus--) {
			System.out.print("*");
		}
		
	}
	
	/**
	 * Método responsável por imprimir as n linhas da escada<br/><br/>
	 * <b>Uso: </b><br/><br/>
	 * n = 10 // Tamanho da escada <br/>
	 * imprimirEscada(n);
	 * @param tamanho tipo inteiro, tamanho da escada base e altura
	
	 */
	public static void imprimirEscada(int tamanho) {
		
		for(int degrau = 1; degrau <= tamanho; degrau++) {
			System.out.println();
			imprimirLinha(tamanho, degrau);						
		}
		
	}
	
	/**
	 * Médodo principal da classe, responsável pela execução do algoritmo	
	 * @param args array de string, argumentos que podem ser passados para o método main
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = scanner.nextInt();		
		
		scanner.close();
		
		imprimirEscada(n);
	}
}
