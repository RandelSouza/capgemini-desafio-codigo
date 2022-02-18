package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * <b>Descrição da Questão: </b>
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
 * podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
 * algoritmo que encontre o número de pares de substrings que são anagramas.<br/>
 * 
 * <b>Exemplo: </b><br/><br/>
 * 
 * <b>Exemplo 1): </b><br/><br/>
 * 
 * <b>Entrada: </b><br/><br/>
 * <div style="background-color: #e9e9e9">ovo</div><br/>
 * 
 * <b>Saída: </b><br/><br/>
 * <div style="background-color: #e9e9e9">2</div><br/>
 * 
 * <b>Explicação: </b><br/><br/>
 * 
 * A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1],
 * [1, 2]] respectivamente.<br/>
 * 
 * <b>Exemplo 1): </b><br/><br/>
 * 
 * <b>Entrada: </b><br/><br/>
 *  <div style="background-color: #e9e9e9">ifailuhkqq</div><br/>
 * 
 * <b>Saída: </b><br/><br/>
 * <div style="background-color: #e9e9e9">3</div><br/>
 * 
 * <b>Explicação: </b><br/><br/>
 * 
 * A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]],
 * [[8, 9]] e [[0, 1, 2], [1, 2, 3]].
 * 
 * @author Randel Souza Almeida
 * @version 1.0
 * @since fev 2022
 *
 */
public class Questao03 {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        scanner.close();

        HashMap<String, Integer> anagramasMap = mapearSubString(palavra);
        int quantidadeAnagramas = contabilizarAnagramas(anagramasMap);

        System.out.println(quantidadeAnagramas);
    }

    public static int contabilizarAnagramas( HashMap<String, Integer> mapaAnagramas ) {
        int numeroAnagramas = 0;

        for(String chave : mapaAnagramas.keySet()) {
	    int valor = mapaAnagramas.get(chave);
	    numeroAnagramas += ( valor * ( valor - 1) ) / 2;
        }

        return numeroAnagramas;
    }

    public static HashMap<String, Integer> mapearSubString( String palavra ){
        HashMap<String, Integer> mapaAnagramas = new HashMap<>();

        for(int k  = 0; k <= palavra.length(); k++){
            for( int j = k; j < palavra.length(); j++ ){

                char[] caractere = palavra.substring(k, j+1).toCharArray();
                Arrays.sort(caractere);
                String substring = new String(caractere);

                if(mapaAnagramas.containsKey(substring))
                    mapaAnagramas.put(substring, mapaAnagramas.get(substring) + 1);
                else
                    mapaAnagramas.put(substring, 1);
            }
        }

        return mapaAnagramas;

    }
}
