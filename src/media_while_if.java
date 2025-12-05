import java.util.Scanner;
import java.util.Locale;
public class media_while_if {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade = sc.nextInt();
        int somaIdade = 0;
        int contador = 0;

        while (idade >= 0) {
            somaIdade += idade;
            contador ++; //eu preciso saber quantas pessoas eu irei dividir na media
            idade = sc.nextInt();
        }
        //Faz uma verificação de segurança com o contador. "Entrou alguem na festa?"
        //Se cont for 0, significa que a primeira pessoa já digitou negativo.
        if (contador > 0) {
            double media = (double) somaIdade / contador;
            System.out.printf("%.2f%n",media);
        }
        else{
            System.out.println("Impossivel calcular");
        }

        sc.close();

    }
}
