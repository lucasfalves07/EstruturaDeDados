// 68º) Elaborar um programa, em linguagem Java, capaz de realizar a busca de um
// determinado caractere, digitado, em um vetor qualquer de tamanho 10, também com
// seus elementos do tipo char digitados, informando qual o índice do vetor que esse
// caractere se localiza. Utilizar ordenação do tipo seleção e busca binária recursiva.

import javax.swing.*;

public class Ex68 {

    // Função de ordenação por seleção (Selection Sort)
    public static void selectionSort(char[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento na parte não ordenada do vetor
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }
            // Troca o menor elemento com o primeiro elemento não ordenado
            char temp = vetor[i];
            vetor[i] = vetor[menorIndex];
            vetor[menorIndex] = temp;
        }
    }

    // Função de busca binária recursiva
    public static int buscaBinaria(char[] vetor, char chave, int inicio, int fim) {
        if (inicio > fim) {
            return -1;  // Elemento não encontrado
        }
        
        int meio = (inicio + fim) / 2;
        
        if (vetor[meio] == chave) {
            return meio;  // Elemento encontrado
        } else if (vetor[meio] > chave) {
            return buscaBinaria(vetor, chave, inicio, meio - 1);  // Busca na metade esquerda
        } else {
            return buscaBinaria(vetor, chave, meio + 1, fim);  // Busca na metade direita
        }
    }

    public static void main(String[] args) {
        // Criação de um vetor de caracteres de tamanho 10
        char[] vetor = new char[10];
        
        // Entrada de dados do usuário
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite o caractere para a posição " + (i + 1) + ": ").charAt(0);
        }

        // Ordenação do vetor usando o Selection Sort
        selectionSort(vetor);

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
