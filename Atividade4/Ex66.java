// 66º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
// executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
// // Utilizar um método de ordenação por seleção.

import javax.swing.*;

public class Ex66 {

    
    public static void selectionSort(double[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
           
            int maiorIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[maiorIndex]) {
                    maiorIndex = j;
                }
            }
            
            double temp = vetor[i];
            vetor[i] = vetor[maiorIndex];
            vetor[maiorIndex] = temp;
        }
    }

    public static void main(String[] args) {
        
        double[] vetor = new double[20];
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o elemento " + (i + 1) + ":"));
        }

        // Ordenação do vetor usando o Selection Sort (ordem decrescente)
        selectionSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado em ordem decrescente: ";
        for (double valor : vetor) {
            vetorOrdenado += valor + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);
    }
}
