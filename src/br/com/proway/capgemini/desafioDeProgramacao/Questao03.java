package br.com.proway.capgemini.desafioDeProgramacao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * <b>Descrição da Questão: </b>
 * Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
 * podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
 * algoritmo que encontre o número de pares de substrings que são anagramas.<br/><br/>
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
 * <b>Exemplo 2): </b><br/><br/>
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
     /**
     * Médodo principal da classe, responsável pela execução do algoritmo
     * @param args array de String, argumentos que podem ser passados para o método main
     */
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        scanner.close();

        HashMap<String, Integer> anagramasMap = mapearSubString(palavra);
        int quantidadeAnagramas = contabilizarAnagramas(anagramasMap);

        System.out.println(quantidadeAnagramas);
    }

    /**
    * Método contabilizarAnagramas faz a contabilização de quantas substrings são anagramas
    * @param mapaAnagramas HashMap<String, Integer> passando o mapeamento das substrings
    * @return retorna um inteiro que é o número de anagramas contabilizados
    */
    public static int contabilizarAnagramas( HashMap<String, Integer> mapaAnagramas ) {
        int numeroAnagramas = 0;

        for(String chave : mapaAnagramas.keySet()) {
            int valor = mapaAnagramas.get(chave);
            numeroAnagramas += ( valor * ( valor - 1) ) / 2;
        }

        return numeroAnagramas;
    }

    /**
    * Método mapearSubString responsável por percorer a palavra e encontrar substrings, retornando seu mapeamento
    * @param palavra palavra do tipo String
    * @return retorna um HashMap<String, Integer> que é o mapeamento das substrings
    */
    public static HashMap<String, Integer> mapearSubString( String palavra ){
    	/*
    	 * HashMap armazena os dados em uma estrutura de pares chave e valor.
    	 * Nessa implementação a chave é do tipo String e o valor do tipo Integer.
    	 * A chave será cada substring e o valor a quantidade de ocorrências na palavra
    	 * Exemplo: a palavra "cadsa" será mapeada da seguinte forma:
    	 * 
    	 * {a=2, ac=1, aads=1, c=1, acd=1, ad=1, d=1, ds=1, ads=2, as=1, s=1, aacds=1, acds=1}
    	 * 
    	 * Cada chave à esquerda da igualdade e o valor à direita,
    	 * neste exemplo existem duas substrings que são anagramas são "ads" e "a", ['ads',  'dsa'], ['a', 'a'] 
    	 * estão nos índices [ [1, 2, 3], [2, 3, 4] ] e [ [1, 4] ] respectivamente.
    	 */
        HashMap<String, Integer> mapaAnagramas = new HashMap<>();

        for(int k  = 0; k <= palavra.length(); k++){
            for( int j = k; j < palavra.length(); j++ ){

                char[] substring = palavra.substring(k, j+1).toCharArray();
                Arrays.sort(substring);
                String palavraNova = new String(substring);

                if(mapaAnagramas.containsKey(palavraNova)) {
                     mapaAnagramas.put(palavraNova, mapaAnagramas.get(palavraNova) + 1);
                }
                else {
                    mapaAnagramas.put(palavraNova, 1);
                }
            }
        }

        return mapaAnagramas;

    }
}
