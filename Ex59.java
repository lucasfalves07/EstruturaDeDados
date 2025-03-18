//59º) Elaborar um programa, em linguagem Java, capaz de receber, em ordem aleatória,
// o conteúdo de cada elemento de um vetor do tipo char, de tamanho 5, via teclado,
//executar uma ordenação crescente no mesmo e apresentar o vetor ordenado em tela.
//Utilizar um método de ordenação por trocas.


import javax.swing.*;

public class Ex59 {
    public static void main(String[] args) {
        char[] vetor = new char[5];
        
        
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
                }
            }
        }
        
        // Exibindo o vetor ordenado
        StringBuilder resultado = new StringBuilder("Vetor ordenado: ");
        for (char c : vetor) {
            resultado.append(c).append(" ");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
