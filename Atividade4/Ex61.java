// 61º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo double, de tamanho 20, via teclado,
// executar uma ordenação decrescente do mesmo e apresentar o vetor ordenado em tela.
// Utilizar um método de ordenação por trocas.

import javax.swing.*;

public class Ex61 {
    public static void main(String[] args) {
        double[] vetor = new double[20];
        
        
        for (int i = 0; i < vetor.length; i++) {
            String input = JOptionPane.showInputDialog("Digite um número decimal:");
            vetor[i] = Double.parseDouble(input);
        }
        
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] < vetor[j + 1]) {
                    // Troca os elementos
                    double temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        
        
        StringBuilder resultado = new StringBuilder("Vetor ordenado (decrescente): ");
        for (double num : vetor) {
            resultado.append(num).append(" ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}