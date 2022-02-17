package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Objects;
/**
 * Classe Login, representa o login do usuário no sistema
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class Login{
	/**
	 * Nome utilizado para realização do login
	 */
	private String nome;
	/**
	 * Senha utilizada para ingressar no sistema
	 */
	private String senha;
	
	/**
	 * Método que tem a finalidade de avaliar a segurança da senha propondo a adição ou não de mais caracteres
	 * levando em conta as seguintes regras de negócio: <br/><br/>
	 * Possuir no mínimo 6 caracteres. <br/>
	 * Conter no mínimo 1 digito. <br/>
	 * Conter no mínimo 1 letra em minúsculo. <br/>
	 * Conter no mínimo 1 letra em maiúsculo. <br/>
	 * Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	 * @param senha senha do tipo String, senha que será avaliada o grau de segurança (força da senha)
	 * @return retorno do tipo inteiro, é retornado quantos caracteres devem ser adicionados para que a senha seja segura
	 */
	public int avaliarSenha(String senha) {					
		boolean maiscula = false; 
		boolean minuscula = false;
		boolean digito = false;
		boolean caractereEspecial = false;
		int quantidadeCaracteres = senha.length();
		int senhaSegura = 0;
		String caracteresEspeciais = "!@#$%^&*()-+";
		
		
		for (char caractere : senha.toCharArray()) {
			if(Character.isUpperCase(caractere) && !maiscula) { maiscula = true; }
			
			if(Character.isLowerCase(caractere) && !minuscula) { minuscula = true; }
			
			if(Character.isDigit(caractere) && !digito) { digito = true; }
			
			if(caracteresEspeciais.contains(String.valueOf(caractere)) && !caractereEspecial) {
				caractereEspecial = true;
			}						
		}
		
		if(!maiscula) { senhaSegura++; }
		
		if(!minuscula) { senhaSegura++; }
		
		if(!digito) { senhaSegura++; }
		
		if(!caractereEspecial) { senhaSegura++; }
			
		if( (quantidadeCaracteres + senhaSegura) < 6) {			
			senhaSegura += ( 6 - (quantidadeCaracteres + senhaSegura) );
		}			
		
		return senhaSegura;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		if(avaliarSenha(senha) == 0) {
			this.senha = senha;
		}	
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha);
	}

	@Override
	public String toString() {
		return "Login [nome=" + nome + ", senha=" + senha + "]";
	}		
	
	
}