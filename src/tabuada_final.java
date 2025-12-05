import java.util.Scanner;

public class tabuada_final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ler o número
        System.out.print("Digite o número para a tabuada: ");
        int n = sc.nextInt();
        // Ler o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);
        // Fazer a tabuada com switch
        System.out.println("\n--- Tabuada de " + n + " ---");
        // Switch casa para facilitar a ESCOLHA do operador (+, -, *, /)
        for (int i = 1; i <= 10; i++) {
            switch (operador) {
                case '+':
                    System.out.println(n + " + " + i + " = " + (n + i));
                    break;
                case '-':
                    System.out.println(n + " - " + i + " = " + (n - i));
                    break;
                case '*':
                    System.out.println(n + " * " + i + " = " + (n * i));
                    break;
                case '/':
                    System.out.println(n + " / " + i + " = " + (n / i));
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }
        }

        sc.close();
    }
}
/*
Versão final(?) da tabuada.
Foi aplicado estrutura repetitiva e condicional com metodo switch-case;
 */
