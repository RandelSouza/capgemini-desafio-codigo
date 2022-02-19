package br.com.proway.capgemini.desafioDeProgramacao;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecutarTodosTestes {
    public static void main(String[] args) {
        /*
        * Automatizando execução dos testes da questão 01.
        */
        Result resultadoQuestao01 = JUnitCore.runClasses(TestesUnitariosQuestao01.class);

        for (Failure falha : resultadoQuestao01.getFailures()) {
             System.out.println(falha);
        }

        System.out.println("Questão 01:" + ( resultadoQuestao01.wasSuccessful() == true ? " Passou em todos os testes." : "Falhou" ) );

        /*
        * Automatizando execução dos testes da questão 02.
        */
        Result resultadoQuestao02 = JUnitCore.runClasses(TestesUnitariosQuestao02.class);

        for (Failure falha : resultadoQuestao02.getFailures()) {
            System.out.println(falha);
        }

        System.out.println("Questão 02:" + ( resultadoQuestao02.wasSuccessful() == true ? " Passou em todos os testes." : "Falhou" ) );

        /*
        * Automatizando execução dos testes da questão 03.
        */
        Result resultadoQuestao03 = JUnitCore.runClasses(TestesUnitariosQuestao03.class);

        for (Failure falha : resultadoQuestao03.getFailures()) {
            System.out.println(falha);
        }

        System.out.println("Questão 03:" + ( resultadoQuestao03.wasSuccessful() == true ? " Passou em todos os testes." : "Falhou" ) );
   }
}
