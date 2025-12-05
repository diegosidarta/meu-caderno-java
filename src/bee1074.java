import java.util.Scanner;

public class bee1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //quantidade de valores lidos (i<N);

        for (int i = 0; i < N; i++) {

            int x = sc.nextInt();
            //verificar se o primeiro valor já é invalido
            if (x == 0) {
                System.out.println("NULL");
            }
            //verificar se o valor x é PAR e NEGATIVO
            else if (x % 2 == 0 && x < 0) {
                System.out.println("EVEN NEGATIVE");
            }
            //verificar se o valor x é PAR e POSITIVO
            else if (x % 2 == 0 && x > 0) {
                System.out.println("EVEN POSITIVE");
            }
            //verificar se o valor x é IMPAR e POSITIVO
            else if (x % 2 != 0 && x > 0) {
                System.out.println("ODD POSITIVE");
            }
            //a exceção so pode ser NEGATIVO
            else{
                System.out.println("ODD NEGATIVE");
            }

        }


    }
}
/*
RESUMO (Beecrowd 1074):
Ler N números e dizer se são Pares/Ímpares e Positivos/Negativos.
Se for 0, imprimir NULL.

LÓGICA:
Usar um FOR para repetir N vezes.

Dentro do FOR, usar IF/ELSE IF para filtrar:

Zero (Null)

Par + Positivo / Par + Negativo

Ímpar + Positivo / Ímpar + Negativo

 */
