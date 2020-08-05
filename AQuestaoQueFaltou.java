/*
 Descubra o tamanho dos maiores prefixo e sufixo possíveis.

Objetivo
Crie um algoritmo que recebe uma palavra (string) e retorne o tamanho do prefixo mais longo que também é um sufixo,
se a resposta for zero o algoritmo deve retornar -1:

solucao("abcdcba") → retorna 3 (O maior prefixo == sufixo é "abc")
solucao("abcda") → retorna 1 (O maior prefixo == sufixo é "a")
solucao("abbd") → retorna -1 (Nenhum prefixo == sufixo)
O prefixo não deve sobrepor o sufixo:

solucao("aaaa") → retorna 2 (O maior prefixo == sufixo é "aa")
solucao("aa") → retorna 1 (O maior prefixo == sufixo é "a")
solucao("a") → retorna -1 (Nenhum prefixo == sufixo)
 */
package CrescerQuestao3;

import java.util.Scanner;


public class questao3Test {
    
    public static void main(String args[]){
        
        String palavra = new String();
        
        Scanner input = new Scanner(System.in);
        
        palavra = input.nextLine();
        
        int i, j, meio, contador = 0; 
        
        
            meio = palavra.length()/2;
            char aux[] = new char[meio];
            for(i=0; i<meio; i++){
                aux[i]= palavra.charAt(i);
            }
            
            j = 0;
            i = palavra.length()-1;
            while(i>meio-i && j<aux.length){
                if(palavra.charAt(i) == aux[j]){
                    contador++;
                    j++;
                }else{
                    break;
                }
                i--;
            }
            
            if(contador>0){
            String prefixoIgualSufixo = palavra.substring(0, contador);
            System.out.println(prefixoIgualSufixo);
            }else{
                System.out.println("-1");
            }
            
        }
        
    }
    

        
