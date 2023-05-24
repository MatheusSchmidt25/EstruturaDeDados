package com.mycompany.ordenacaoselecao;

public class OrdenacaoSelecao {

    public static void main(String[] args) {
        
        int [] vetorNumeros = {45, 20, 33, 40, 50, 2, 15, 88,8};
        
        for(int i = 0; i < vetorNumeros.length-1; i++){
            int posicaoMenor = i;
            
            for(int j = i+1; j < vetorNumeros.length; j++){
                if(vetorNumeros [j] < vetorNumeros[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            if(posicaoMenor != i){
                int aux = vetorNumeros[i];
                vetorNumeros[i] = vetorNumeros[posicaoMenor];
                vetorNumeros[posicaoMenor] = aux;
            }
        }
        for(int i = 0; i < vetorNumeros.length; i++){
            System.out.println("posicao ["+i+"] = " +vetorNumeros[i]);
        }
    }
}
