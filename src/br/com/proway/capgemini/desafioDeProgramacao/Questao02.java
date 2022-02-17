package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Instânciando um objeto Login
		Login login = new Login();
			
		String senha = scanner.next();		
		
		scanner.close();
		
		int senhaSegura = login.avaliarSenha(senha);
		
		System.out.println(senhaSegura);
	}

}


