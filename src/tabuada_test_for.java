import java.util.Locale;
import java.util.Scanner;
public class tabuada_test_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da tabuada:");

        int N = sc.nextInt();
        // O FOR é o ESQUELETO (Roda 10 vezes, de 1 a 10)
        for(int i = 1; i <= 10; i++ ) {
            //CÁLCULOS
            int soma = i + N;
            int subtracao = i - N;
            int produto = i * N;
            double divisao = (double) i / N;
            //SAÍDA FORMATADA
            System.out.printf("%d + %d = %d%n", i, N, soma);
            System.out.printf("%d - %d = %d%n", i, N, subtracao);
            System.out.printf("%d * %d = %d%n", i, N, produto);
            System.out.printf("%d / %d = %.2f%n", i, N, divisao);

            System.out.println("---"); // Separador para organizar a visualização
        }

        sc.close();
    }
}
//Falta ajeitar o resultado na tela!!!!