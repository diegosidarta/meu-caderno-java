import java.util.Locale;
import java.util.Scanner;
public class vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // A quantidade de 'caixas' do vetor
        double[] vet = new double[N];
        // Primeiro Loop: A coleta (input)
        for (int i=0; i<N; i++) {
            vet[i] = sc.nextDouble(); // "O garçom anota o pedido"
        }
        // Segundo Loop: A exibição (output)
        for (int i=0; i<N; i++) {
            System.out.printf("%.2f%n", vet[i]);// "O garçom LÊ o pedido"
        }

        sc.close();
        
    }
}

/*
Linha de comando 11:
O objetivo é preencher a memória (o vetor vet) com todos os dados.

Linha de comando 15:
Agora que o computador já tem todos os dados guardados na memória,
ele pode trabalhar com eles ou mostrá-los.
 */