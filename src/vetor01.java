import java.util.Locale;
import java.util.Scanner;
public class vetor01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double[] vet = new double[N];

        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0]; //Guarda o conteudo
        int posicaoMaior = 0; //Guarda a 'etiqueta' do indice

        for (int i=1; i<N; i++) {
            if (vet[i] > maior) {
                maior = vet[i]; //Atualiza o valor
                posicaoMaior = i; //Atualiza o endereço
            }
        }

        System.out.printf("%.1f%n", maior);
        System.out.println(posicaoMaior);

        sc.close();
    }
}
