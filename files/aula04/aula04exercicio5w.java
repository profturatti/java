package aula4;
import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        String senha;
        do {
            senha = JOptionPane.showInputDialog("Digite a senha");
            if (!senha.equals("1234"))
                JOptionPane.showMessageDialog(null, "Senha incorreta! \nDigite novamente");
         } while(!senha.equals("1234"));
         JOptionPane.showMessageDialog(null, "Acesso permitido!");
    }
}
