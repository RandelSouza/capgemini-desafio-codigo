package br.com.proway.capgemini.desafioDeProgramacao;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe destinada a testar a Questão 01.
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class TestesUnitariosQuestao01 {
	 /**
     * Testando o tamanho de escada com n igual a 6 com espaçamento e * corretos.
     */
    @Test
    public void testeQuestao01EscadaTamanho6() {
       
        int tamanhoEscada = 6;

        String escada = "     *\n"
                      + "    **\n"
                      + "   ***\n"
                      + "  ****\n"
                      + " *****\n"
                      + "******\n";

        Assert.assertEquals(Questao01.criarEscada(tamanhoEscada), escada);

    }

    /**
     * Testando o tamanho de escada com n igual a 6 sem espaçamento.
     */
    @Test
    public void testeQuestao01EscadaTamanho6SemEspacos() {
       
        int tamanhoEscada = 6;

        String escada = "*\n"
                      + "**\n"
                      + "***\n"
                      + "****\n"
                      + "*****\n"
                      + "******\n";

        Assert.assertNotEquals(Questao01.criarEscada(tamanhoEscada), escada);
    }

    /**
     * Testando o tamanho de escada com n igual a 6 com espaçamento e * corretos.
     * Porém com ordem invertida.
     */
    @Test
    public void testeQuestao01EscadaTamanho6Invertida() {
      
        int tamanhoEscada = 6;

        String escada = "******\n"
                      + "***** \n"
                      + "****  \n"
                      + "***   \n"
                      + "**    \n"
                      + "*     \n";

        Assert.assertNotEquals(Questao01.criarEscada(tamanhoEscada), escada);
   }
}

