package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe destinada a testar a Questão 03.
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class TestesUnitariosQuestao03 {
	/**
     * Número esperado de anagramas em substrings: 2.
     */
	@Test
    public void teste01Questao03() {        
        String palavra = "ovo";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  2);
    }

	 /**
     * Número esperado de anagramas em substrings: 3.
     */
    @Test
    public void teste02Questao03() {       
        String palavra = "ifailuhkqq";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  3);
    }

    /**
     * Número esperado de anagramas em substrings: 28.
     */
    @Test
    public void teste03Questao03() {        
        String palavra = "casaasac";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  28);
    }
}
