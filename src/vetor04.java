import java.util.Locale;
import java.util.Scanner;
public class vetor04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        // Coleta
        for (int i=0; i<N; i++){
            vet[i] = sc.nextDouble();
        }

        // Soma das Coletas
        double soma = 0;
        for (int i=0; i<N; i++){
            soma += vet[i];
        }

        // Média aritmética de todos elementos
        double media = soma / N;
        System.out.println(media);

        // Exibição dos valores abaixo da média
        for (int i=0; i<N; i++){
            if(vet[i] < media){
                System.out.printf("%.1f%n",vet[i]);
            }
        }
        sc.close();
    }
}
