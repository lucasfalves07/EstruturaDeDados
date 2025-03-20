// 62º) Elaborar um programa, em linguagem Java, capaz de informar quantas operações
// de troca realizaremos no exercício no. 59 para ordenar o vetor e, através dele, concluir
// quantas são realizadas para o melhor e para o pior caso?

import javax.swing.*;

public class Ex62 {
    public static void main(String[] args) {
        char[] vetor = new char[5];
        int trocas = 0;
        
        
        for (int i = 0; i < vetor.length; i++) {
            String input = JOptionPane.showInputDialog("Digite um caractere:");
            if (input != null && input.length() > 0) {
                vetor[i] = input.charAt(0);
            } else {
                i--; 
            }
        }
        
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    
                    char temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    trocas++;
                }
            }
        }
        
        
        int melhorCaso = 0; 
        int piorCaso = (vetor.length * (vetor.length - 1)) / 2; 
        
        
        StringBuilder resultado = new StringBuilder("Vetor ordenado: ");
        for (char c : vetor) {
            resultado.append(c).append(" ");
        }
        resultado.append("\nTrocas realizadas: ").append(trocas)
                 .append("\nMelhor caso: ").append(melhorCaso)
                 .append("\nPior caso: ").append(piorCaso);
        
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}