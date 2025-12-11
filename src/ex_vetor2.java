import java.util.Scanner;
import java.util.Locale;

public class ex_vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];
        // for nº1: Coleta
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }
        // for nº2: Exibição
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();
        double soma = 0.0;
        // for nº3: Cálculo
        for (int i = 0; i < N; i++) {
            soma = soma + vet[i];
        }
        System.out.printf("%.2f%n", soma);
        double media = soma / N;
        System.out.printf("%.2f%n", media);
        sc.close();
    }
}

