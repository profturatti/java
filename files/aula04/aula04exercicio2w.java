package aula4;
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        // Declaração das variáveis:
        int numero;
        String tabuada;
        // Entrada de dados:
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        // Processamento:
        tabuada = "Tabuada do "+numero+": \n";
        for (int i = 1; i<=10; i++) {
            tabuada+=1+" x "+numero+" = "+i*numero+"\n";
        }
        // Saída:
        JOptionPane.showMessageDialog(null, tabuada);
    }
}
