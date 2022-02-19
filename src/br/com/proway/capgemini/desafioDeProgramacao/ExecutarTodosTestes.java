package br.com.proway.capgemini.desafioDeProgramacao;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
/**
 * Classe destinada a automatizar os testes unitários das questões 01, 02 e 03.
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 */
public class ExecutarTodosTestes {
	
    /**
    * Automatizando execução dos testes da questão 01, 02 e 03.
    * @param args array de String, argumentos que podem ser passados para o método main     
    */
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
