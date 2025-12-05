import java.util.Locale;
import java.util.Scanner;
public class estrutura_for {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /*Fazer um programa que le um valor inteiro N e depois N números inteiros.
        Ao final, mostra a soma dos N números lidos.
        */
        int N = sc.nextInt();
        int soma = 0;

        for(int i=0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println(soma);
    }

}
