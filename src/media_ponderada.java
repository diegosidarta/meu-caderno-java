import java.io.IOException;
import java.util.Scanner;
public class media_ponderada {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }


    }

}