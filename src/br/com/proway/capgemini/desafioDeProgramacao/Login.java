package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Objects;

class Login{
	private String nome;
	private String senha;
	
	public int avaliarSenha(String senha) {
		// Regras de Negócio
		/*
		 * Possui no mínimo 6 caracteres.
		 * Contém no mínimo 1 digito.
		 * Contém no mínimo 1 letra em minúsculo.
		 * Contém no mínimo 1 letra em maiúsculo.
		 * Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
		 */
				
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