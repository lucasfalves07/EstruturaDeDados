// 63º) Elaborar um programa, em linguagem Java, capaz de realizar a busca de um
// determinado caractere, digitado, em um vetor qualquer de tamanho 10, também com
// seus elementos do tipo char digitados, informando qual o índice do vetor que esse
// caractere se localiza. Utilizar ordenação do tipo troca e busca binária recursiva.

import javax.swing.*;

public class Ex63 {

    
    public static void bubbleSort(char[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    
                    char temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    
    public static int buscaBinaria(char[] vetor, char chave, int inicio, int fim) {
        if (inicio > fim) {
            return -1;  
        }

        int meio = (inicio + fim) / 2;

        if (vetor[meio] == chave) {
            return meio;  
        } else if (vetor[meio] > chave) {
            return buscaBinaria(vetor, chave, inicio, meio - 1); 
        } else {
            return buscaBinaria(vetor, chave, meio + 1, fim);  
        }
    }

    public static void main(String[] args) {
        
        char[] vetor = new char[10];

        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite o caractere para a posição " + (i + 1) + ": ").charAt(0);
        }

        
        bubbleSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado: ";
        for (char c : vetor) {
            vetorOrdenado += c + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);

        // Entrada do caractere a ser buscado
        char chave = JOptionPane.showInputDialog("Digite o caractere a ser buscado: ").charAt(0);

        // Busca binária
        int resultado = buscaBinaria(vetor, chave, 0, vetor.length - 1);

        // Exibição do resultado da busca
        if (resultado == -1) {
            JOptionPane.showMessageDialog(null, "Caractere não encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "Caractere encontrado na posição: " + resultado);
        }
    }
}
