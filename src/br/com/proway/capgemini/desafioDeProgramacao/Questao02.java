package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Scanner;

/**
 * <b>Descrição da Questão:</b> Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
 * página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
 * forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios: <br/><br/>
 * 
 * <ul>
 * <li>Possui no mínimo 6 caracteres.</li>
 * <li>Contém no mínimo 1 digito.</li>
 * <li>Contém no mínimo 1 letra em minúsculo.</li>
 * <li>Contém no mínimo 1 letra em maiúsculo.</li>
 * <li>Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+</li>
 * </ul>
 * 
 * <br/>
 * <b>Exemplo:</b><br/><br/>
 * 
 * <b>Entrada:</b><br/><br/>
 * 
 * <div style="background-color: #e9e9e9">Ya3</div><br/>
 * 
 * <b>Saída:</b><br/><br/>
 * 
 * <div style="background-color: #e9e9e9">3</div><br/>
 *
 * <b>Explicação:</b><br/><br/>
 * Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando
 * a senha em Ya3&ab. <b>
 * 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
 * mínimo de 6 caracteres.
 * 
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class Questao02 {

	/**
	 * Médodo principal da classe, responsável pela execução do algoritmo	
	 * @param args array de string, argumentos que podem ser passados para o método main
	 */
	public static void main(String[] args) {
		// Instânciando um Scanner para a entrada de dados pelo usuário
		Scanner scanner = new Scanner(System.in);
		
		// Instânciando um objeto Login
		Login login = new Login();
		
		// Obtendo-se a senha pelo prompt
		String senha = scanner.next();		
		
		// Fechando o scanner
		scanner.close();
		
		// Verificando a segurança da senha
		int senhaSegura = login.avaliarSenha(senha);
		
		// Mostrando as adições (ou não) de quantidade de caracteres necessários (levando em conta as regras de negócio)
		System.out.println(senhaSegura);
	}

}


