// 72º) Elaborar um programa, em linguagem Java, capaz de informar quantas operações
// de inserção realizaremos no exercício no. 69 para ordenar o vetor e, através dele,
// concluir quantas são realizadas para o melhor e para o pior caso?

import javax.swing.*;

public class Ex72 {

    
    public static int insertionSort(char[] vetor) {
        int n = vetor.length;
        int operacoes = 0; 

        for (int i = 1; i < n; i++) {
            char chave = vetor[i];
            int j = i - 1;

            
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
                operacoes++;  
            }
            vetor[j + 1] = chave;
            operacoes++;  
        }

        return operacoes;
    }

    public static void main(String[] args) {
        
        char[] vetor = new char[5];

       
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = JOptionPane.showInputDialog("Digite o caractere para a posição " + (i + 1) + ": ").charAt(0);
        }

        
        int operacoes = insertionSort(vetor);

        // Exibição do vetor ordenado
        String vetorOrdenado = "Vetor ordenado: ";
        for (char c : vetor) {
            vetorOrdenado += c + " ";
        }
        JOptionPane.showMessageDialog(null, vetorOrdenado);

        // Exibição do número de operações realizadas
        JOptionPane.showMessageDialog(null, "Total de operações realizadas: " + operacoes);

        // Conclusão sobre o melhor e pior caso
        JOptionPane.showMessageDialog(null,
            "Melhor caso (vetor já ordenado): " + (vetor.length - 1) + " operações\n" +
            "Pior caso (vetor ordenado de forma inversa): " + operacoes + " operações"
        );
    }
}

