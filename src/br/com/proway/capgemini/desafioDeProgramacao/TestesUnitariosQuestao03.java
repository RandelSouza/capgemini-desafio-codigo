package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class TestesUnitariosQuestao03 {
    @Test
    public void teste01Questao03() {
        /**
        * Número esperado de anagramas em substrings: 2.
        */
        String palavra = "ovo";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  2);
    }

    @Test
    public void teste02Questao03() {
        /**
        * Número esperado de anagramas em substrings: 3.
        */
        String palavra = "ifailuhkqq";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  3);
    }

    @Test
    public void teste03Questao03() {
        /**
        * Número esperado de anagramas em substrings: 28.
        */
        String palavra = "casaasac";
        HashMap<String, Integer> anagramasMap = Questao03.mapearSubString(palavra);

        Assert.assertEquals(Questao03.contabilizarAnagramas(anagramasMap),  28);
    }
}
