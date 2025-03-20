// 69º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado,
// executar uma ordenação crescente do mesmo e apresentar o vetor ordenado em tela.
// Utilizar um método de ordenação por inserção.

import javax.swing.*;

public class Ex69 {

    
    public static void insertionSort(char[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            char chave = vetor[i];
            int j = i - 1;

           
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
        
        char[] vetor = new char[5];
        
       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite o caractere para a posição " + (i + 1) + ": ").charAt(0);
        }

        // Ordenação do vetor usando o Insertion Sort
        insertionSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado: ";
        for (char c : vetor) {
            vetorOrdenado += c + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);
    }
}
