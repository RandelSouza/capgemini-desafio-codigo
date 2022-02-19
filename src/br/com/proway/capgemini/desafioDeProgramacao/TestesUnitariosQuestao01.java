package br.com.proway.capgemini.desafioDeProgramacao;

import org.junit.Assert;
import org.junit.Test;


public class TestesUnitariosQuestao01 {

    @Test
    public void testeQuestao01EscadaTamanho6() {
        /*
        * Testando o tamanho de escada com n igual a 6 com espaçamento e * corretos.
        */
        int tamanhoEscada = 6;

        String escada = "     *\n"
                      + "    **\n"
                      + "   ***\n"
                      + "  ****\n"
                      + " *****\n"
                      + "******\n";

        Assert.assertEquals(Questao01.imprimirEscada(tamanhoEscada), escada);

    }

    @Test
    public void testeQuestao01EscadaTamanho6SemEspacos() {
        /*
        * Testando o tamanho de escada com n igual a 6 sem espaçamento.
        */
        int tamanhoEscada = 6;

        String escada = "*\n"
                      + "**\n"
                      + "***\n"
                      + "****\n"
                      + "*****\n"
                      + "******\n";

        Assert.assertNotEquals(Questao01.imprimirEscada(tamanhoEscada), escada);
    }

    @Test
    public void testeQuestao01EscadaTamanho6Invertida() {
        /*
        * Testando o tamanho de escada com n igual a 6 com espaçamento e * corretos.
        * Porém com ordem invertida.
        */
        int tamanhoEscada = 6;

        String escada = "******\n"
                      + "***** \n"
                      + "****  \n"
                      + "***   \n"
                      + "**    \n"
                      + "*     \n";

        Assert.assertNotEquals(Questao01.imprimirEscada(tamanhoEscada), escada);
   }
}

