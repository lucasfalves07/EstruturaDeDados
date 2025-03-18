// 71º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
// executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
// Utilizar um método de ordenação por inserção.

import javax.swing.*;

public class Ex71 {

   
    public static void insertionSort(double[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            double chave = vetor[i];
            int j = i - 1;

           
            while (j >= 0 && vetor[j] < chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = chave;
        }
    }

    public static void main(String[] args) {
       
        double[] vetor = new double[20];
        
       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o elemento " + (i + 1) + ":"));
        }

       
        insertionSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado em ordem decrescente: ";
        for (double valor : vetor) {
            vetorOrdenado += valor + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);
    }
}
