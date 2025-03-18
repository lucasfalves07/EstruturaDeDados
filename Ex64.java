// 64º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado,
// executar uma ordenação crescente do mesmo e apresentar o vetor ordenado em tela.
// Utilizar um método de ordenação por seleção.

import javax.swing.*;

public class Ex64 {

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

    public static void main(String[] args) {
        // Criação de um vetor de caracteres de tamanho 5
        char[] vetor = new char[5];
        
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
    }
}
