// 67º) Elaborar um programa, em linguagem Java, capaz de informar quantas operações
// de seleção realizaremos no exercício no. 64 para ordenar o vetor e, através dele, concluir
// quantas são realizadas para o melhor e para o pior caso?

import javax.swing.*;

public class Ex67 {

    
    public static int selectionSort(int[] vetor) {
        int n = vetor.length;
        int operacoes = 0;

        for (int i = 0; i < n - 1; i++) {
            int menorIndex = i;
            for (int j = i + 1; j < n; j++) {
                operacoes++; 
                if (vetor[j] < vetor[menorIndex]) {
                    menorIndex = j;
                }
            }
           
            int temp = vetor[i];
            vetor[i] = vetor[menorIndex];
            vetor[menorIndex] = temp;
        }

        return operacoes;
    }

    public static void main(String[] args) {
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
        
       
        int[] vetor = new int[tamanho];
        
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para o elemento " + (i + 1) + ":"));
        }

        
        int operacoes = selectionSort(vetor);

        
        String vetorOrdenado = "Vetor ordenado: ";
        for (int i = 0; i < vetor.length; i++) {
            vetorOrdenado += vetor[i] + " ";
        }

        
        JOptionPane.showMessageDialog(null, vetorOrdenado + "\nTotal de operações de comparação: " + operacoes);

        // Conclusão sobre o melhor e o pior caso:
        JOptionPane.showMessageDialog(null,
            "Melhor caso: " + (vetor.length - 1) * (vetor.length / 2) + " comparações (vetor já ordenado)\n" +
            "Pior caso: " + operacoes + " comparações (vetor totalmente inverso)"
        );
    }
}
