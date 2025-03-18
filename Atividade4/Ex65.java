// 65º) Elaborar um programa, em linguagem Java, capaz de receber, via teclado e em
// ordem aleatória, o conteúdo de cada um dos elementos de um vetor do tipo int, de
// tamanho variável, também digitado, executar a ordenação crescente do mesmo e
// apresentar o vetor ordenado em tela. Utilizar um método de ordenação por seleção.

import javax.swing.*;

public class Ex65 {

    
    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }
           
            int temp = vetor[i];
            vetor[i] = vetor[menorIndex];
            vetor[menorIndex] = temp;
        }
    }

    public static void main(String[] args) {
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
        
        
        int[] vetor = new int[tamanho];
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o elemento " + (i + 1) + ":"));
        }

        // Ordenação do vetor usando o Selection Sort
        selectionSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado: ";
        for (int i = 0; i < vetor.length; i++) {
            vetorOrdenado += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);
    }
}
