import java.util.Scanner;
import java.util.Locale;
public class bee1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        /* Algoritmo para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
        O último dado, que não entrará nos cálculos, contém o valor de idade negativa.
        Calcular e imprimir a idade média deste grupo de indivíduos.

        ENTRADA:
        A entrada contém um número indeterminado de inteiros. Será encerrada quando um valor negativo for lido.

        SAÍDA:
        A saída contém um valor correspondente à média de idade dos indivíduos.
        A média deve ser impressa com dois dígitos após o ponto decimal. */

        int idade = sc.nextInt();
        int somaIdade = 0; // Acumulador: Guarda a soma total das idades
        int contador = 0;  // Contador: Guarda o número de pessoas

        while (idade >= 0) {
            somaIdade += idade;
            contador += 1;
            idade = sc.nextInt();
        }
        // Verificação de segurança para evitar divisão por zero
        if (contador > 0) {
            double media = (double) somaIdade / contador;
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("impossivel calcular");
        }

        sc.close();

    }
}
/*
Estrutura de repetição(while): Foi usado pois não sabemos
quantas idades serão digitadas. O loop para quando a entrada for negativa.

Padrão "Acumulador" e "Contador":
somaIdade (Acumulador): Soma valores variáveis.
contador (Contador): Conta a quantidade de eventos (pessoas).

Tratamento de tipos (casting): Conversão explícita de int para double
para garantir precisão decimal na média.
 */