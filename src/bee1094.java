import java.util.Scanner;
import java.util.Locale;
public class bee1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int somaCoelho = 0;
        int somaRato = 0;
        int somaSapo = 0;

        for (int i=0; i<N; i++){
            int quantidade = sc.nextInt();
            char tipo = sc.next().charAt(0);
            if (tipo == 'C'){
                somaCoelho += quantidade;
            }
            else if (tipo == 'R'){
                somaRato += quantidade;
            }
            else{
                somaSapo += quantidade;
            }

            int somaGeral = somaRato + somaCoelho + somaSapo;
            double percentualCoelhos = (double) somaCoelho / somaGeral * 100.0;
            double percentualRatos = (double) somaRato / somaGeral * 100.0;
            double percentualSapos = (double) somaSapo / somaGeral * 100.0;

            System.out.println("Total: " + somaGeral + " cobaias");
            System.out.println("Total de coelhos: " + somaCoelho);
            System.out.println("Total de ratos: " + somaRato);
            System.out.println("Total de sapos: " + somaSapo);
            System.out.printf("Percentual de coelhos: %.2f %%%n", percentualCoelhos);
            System.out.printf("Percentual de ratos: %.2f %%%n", percentualRatos);
            System.out.printf("Percentual de sapos: %.2f %%%n", percentualSapos);

            sc.close();
        }

    }
}
