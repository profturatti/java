package aula4;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        boolean primo = true;
        if (n <= 1) {
            primo = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("É primo.");
        } else {
            System.out.println("Não é primo.");
        }
    }
}
