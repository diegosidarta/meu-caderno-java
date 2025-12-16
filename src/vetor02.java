import java.util.Scanner;
public class vetor02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];

        // Coleta de dados
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        // Exibição dos números pares
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(vet[i] + " ");
            }
        }
        System.out.println(); // "Pular" a linha

        // Exibição da quantidade de pares
        int contPares = 0; // Contador
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                contPares++;
            }
        }
        System.out.println(contPares);

        sc.close();
    }
}
