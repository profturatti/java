package aula4;
import javax.swing.JOptionPane;

public class Exercicio03 {
    public static void main(String[] args) {
        int num, soma=0, cont=0;
        double media=0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if (num!=0) {
              soma+=num;
              cont++;
            }
        } while (num!=0);
        if(cont!=0)
            media = soma / (double) cont;
        JOptionPane.showMessageDialog(null, "Soma: "+soma+"\nMédia: "+media);
    }
}
