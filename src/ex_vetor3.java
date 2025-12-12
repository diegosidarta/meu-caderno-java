import java.util.Scanner;
import java.util.Locale;
public class ex_vetor3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String [] nomes = new String [N];
        int [] idades  = new int[N];
        double [] altura = new double [N];
        //Coleta de informações: nomes, idades, alturas.
        for (int i=0; i<N ; i++){
            nomes [i] = sc.next();
            idades [i] = sc.nextInt();
            altura [i] = sc.nextDouble();
        }
        //Loop para saber a soma das alturas
        double somaAltura = 0;
        for (int i = 0; i<N; i++){
            somaAltura += altura [i];
        }

        double media = (double) somaAltura / N;
        System.out.printf("Altura média: %.2f%n",media);

        //Contador de idades para filtrar os usuarios abaixo de 16 anos
        int contIdades = 0;
        for (int i=0; i<N; i++){
            if (idades[i] < 16){
                contIdades ++;
            }
        }
        //Calculo da porcentagem de pessoas abaixo dos 16 anos
        double porcentagem = (double) contIdades * 100 / N;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",porcentagem); //'%.1f%%%n' para conseguir imprimir % na tela e formatar o resultado
    }
}
