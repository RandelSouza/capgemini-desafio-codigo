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
	 * Constante que determina o número de caracteres minimo para a senha
	 */
	public static final int CARACTERE_MIN = 6;
	
	/**
	 * Método que tem a finalidade de avaliar a segurança da senha, propondo a adição ou não de mais caracteres
	 * levando em conta as seguintes regras de negócio: <br/><br/>
	 * Possuir no mínimo 6 caracteres. <br/>
	 * Conter no mínimo 1 digito. <br/>
	 * Conter no mínimo 1 letra em minúsculo. <br/>
	 * Conter no mínimo 1 letra em maiúsculo. <br/>
	 * Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
	 * 
	 * @param senha senha do tipo String, senha que será avaliada o grau de segurança (força da senha)
	 * @return retorno do tipo inteiro, é retornado quantos caracteres devem ser adicionados para que a senha seja segura
	 */
	public int avaliarSenha(String senha) {							
		int qtdCaracteres = senha.length();
		int senhaSegura = 0;		
		
		if(!contemMaiuscula(senha)) { senhaSegura++; }		
		if(!contemMinuscula(senha)) { senhaSegura++; }		
		if(!contemDigito(senha)) { senhaSegura++; }		
		if(!contemCaractereEspecial(senha)) { senhaSegura++; }
			
		if( (qtdCaracteres + senhaSegura) < CARACTERE_MIN)
		{			
			senhaSegura += ( CARACTERE_MIN - (qtdCaracteres + senhaSegura) );
		}			
		
		return senhaSegura;
	}
	
	/**
	 * Método contemDigito, verifica se a String senha contém o padrão de digito
	 * @param senha
	 * @return
	 */
	public boolean contemDigito(String senha){
		String padraoDigito = ".*[0-9].*";
	    return senha.matches(padraoDigito);
	}
	
	/**
	 * Método contemCaractereEspecial, verifica se a String senha contém o padrão de caractere especial
	 * @param senha
	 * @return
	 */
	public boolean contemCaractereEspecial(String senha){
        String padraoCaractereEspecial = ".*[!@#$%^&*()-+].*";
        return senha.matches(padraoCaractereEspecial);
    }
	
	/**
	 * Método contemMinuscula, verifica se a String senha contém o padrão de letra minuscula
	 * @param senha
	 * @return
	 */
    public boolean contemMinuscula(String senha){
        String padraoMinuscula = ".*[a-z].*";
        return senha.matches(padraoMinuscula);
   	}
    
    /**
     * Método contemMaiuscula, verifica se a String senha contém o padrão de letra maiuscula
     * @param senha
     * @return
     */
    public boolean contemMaiuscula(String senha){
        String padraoMaiscula = ".*[A-Z].*";
        return senha.matches(padraoMaiscula);
    }
	
    /**
     * Método getNome obtém o nome
     * @return retorna o nome do tipo String
     */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Método setNome atribui o nome 
	 * @param nome nome que será atribuido
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Método getSenha
	 * @return
	 */
	public String getSenha() {
		return senha;
	}
	
	/**
	 * Método setSenha
	 * @param senha
	 */
	public void setSenha(String senha) {
		if(avaliarSenha(senha) == 0) {
			this.senha = senha;
		}	
	}

	/**
	 * Método hashCode
	 */
	@Override
	public int hashCode() {
		return Objects.hash(nome, senha);
	}
	
	/**
	 * Método equals
	 */

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
	
	/**
	 * Método toString
	 */

	@Override
	public String toString() {
		return "Login [nome=" + nome + ", senha=" + senha + "]";
	}			
	
}