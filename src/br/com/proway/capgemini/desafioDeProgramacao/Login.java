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
    * Constante que determina o número de caracteres mínimo para a senha
    */
    public static final int CARACTERE_MIN = 6;

    /**
    * Método que tem a finalidade de avaliar a segurança da senha, propondo a adição ou não de mais caracteres
    * levando em conta as seguintes regras de negócio: <br/><br/>
    * Possuir no mínimo 6 caracteres. <br/>
    * Conter no mínimo 1 dígito. <br/>
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
     * Método contemDigito, verifica se a String senha contém o padrão de dígito
     * @param senha senha do tipo String
     * @return retorna um boolean, false se não contém dígito e true caso haja dígito
     */
    public boolean contemDigito(String senha){
        String padraoDigito = ".*[0-9].*";
        return senha.matches(padraoDigito);
    }

    /**
    * Método contemCaractereEspecial, verifica se a String senha contém o padrão de caractere especial
    * @param senha senha do tipo String
    * @return retorna um boolean, false se não contém caractere especial e true caso haja caractere especial
    */
    public boolean contemCaractereEspecial(String senha){
        String padraoCaractereEspecial = ".*[!@#$%^&*()-+].*";
        return senha.matches(padraoCaractereEspecial);
    }

    /**
    * Método contemMinuscula, verifica se a String senha contém o padrão de letra minúscula
    * @param senha senha do tipo String
    * @return retorna um boolean, false se não contém letra minuscula e true caso haja letra minúscula
    */
    public boolean contemMinuscula(String senha){
        String padraoMinuscula = ".*[a-z].*";
        return senha.matches(padraoMinuscula);
    }

    /**
    * Método contemMaiuscula, verifica se a String senha contém o padrão de letra maiúscula
    * @param senha senha do tipo String
    * @return retorna um boolean, false se não contém letra maiúscula e true caso haja letra maiúscula
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
    * @param nome nome que será atribuído
    */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
    * Método getSenha obtém a senha do usuário
    * @return retorna a senha do tipo String
    */
    public String getSenha() {
        return senha;
    }

    /**
    * Método setSenha atribui a senha verificando antes se satisfaz as regras de negócio
    * @param senha senha do usuário do tipo String
    */
    public void setSenha(String senha) {
        if(avaliarSenha(senha) == 0) {
            this.senha = senha;
        }
    }

    /**
    * Método hashCode  é uma ferramenta da JVM usada para montar a tabela de hash de modo correto. <br/>
    * Isso permite que seja muito rápido recuperar uma informação na tabela.
    */
    @Override
    public int hashCode() {
        return Objects.hash(nome, senha);
    }

    /**
    * Método equals é utilizado para comparações. <br/>
    * A classe String e as classes Wrapper sobrescrevem equals() para garantir que dois objetos desses tipos,
    * com o mesmo conteúdo, possam ser considerados iguais.
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
    * Método toString, retorna uma representação em formato string dos atributos do objeto Login.
    */
    @Override
    public String toString() {
        return "Login [nome=" + nome + ", senha=" + senha + "]";
    }
}
