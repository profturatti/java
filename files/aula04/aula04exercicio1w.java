package aula4;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        float notal, nota2, media; String nome, situacao;
        for(int i=0; i<3; i++) {
            nome = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"o. aluno");
            notal = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1 do "+(i+1)+"o. aluno"));
            nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2 do "+(i+1)+"o. aluno"));
            media (nota1+nota2)/2;
            if(media>=7) {
                situacao="Aprovado";
            } else {
                situacao="Reprovado";
            }
        }    
        JOptionPane.showMessageDialog(null, "Nome do aluno: + nome + "\nNotal: "+nota1+"\nNota2: "+nota2+"\nMédia: "+media +"\nSituação: "+situacao");
    }
}
