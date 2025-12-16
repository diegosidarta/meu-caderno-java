import java.util.Locale;
import java.util.Scanner;

public class vetor05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Definir o tamanho do vetor
        int N = sc.nextInt();
        int[] vet = new int[N];

        // Preencher o vetor (Leitura)
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        // Processamento (Soma e Contagem juntas)
        // Otimização: Fazemos tudo em uma passada só pelo vetor
        double soma = 0;
        int qtdPares = 0;

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                soma += vet[i];
            }
        }

        // Verificação de Segurança (Evitando o NaN)
        if (qtdPares == 0) {
            System.out.println("Nenhum número par");
        }
        else {
            double media = soma / qtdPares;
            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
