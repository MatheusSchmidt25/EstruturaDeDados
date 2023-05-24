/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pesquisabinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class PesquisaBinaria {

    public static void main(String[] args) {
         int [] vetor ={10,20,30,40,50,60,70,80,90};
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero a ser pesquisado"));
    }
    
    public static int pesquisaBinaria(int chave, int[]vet){
        int esquerda, meio, direita;
        esquerda=0;
        direita = vet.length -1;
        
         int posicao = pesquisaLinear(chave,vetor);//dando erro aq
        if(posicao >= 0){
           System.out.println("O Elemento "+chave+" esta localizado na posição: "+posicao); 
        }else{
            System.out.println("O elemento "+chave+" não foi localizado na lista");
        }
        
        while(esquerda <= direita){
            meio = (esquerda + direita)/2;
            if(chave == vet[meio]){
                return meio;
            }
            if(chave > vet[meio]){
                esquerda = meio +1;
            }else{
                direita = meio -1;
            }
        }
                
                
        return -1;
    }
}
