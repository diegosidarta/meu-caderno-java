import java.util.Scanner;
public class bee1071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.

        Entrada
        O arquivo de entrada contém dois valores inteiros.
        Saída
        O programa deve imprimir um valor inteiro. Este valor é a soma dos valores ímpares que estão entre
        os valores fornecidos na entrada que deverá caber em um inteiro. */

        int x = sc.nextInt();
        int y = sc.nextInt();
        int min;
        int max;
        //descobrir quem é o mínimo e quem é o máximo
        if (x<y){
            min = x;
            max = y;
        }
        else{
            min = y;
            max = x;
        }
        /* i=min+1 (comece 1 passo depois do minimo);
           i<max (Continue rodando ENQUANTO o número for MENOR que o máximo). */
        int soma = 0;
        for (int i=min+1; i<max; i++){
            if (i % 2 != 0){
                soma += i;
            }
        }

        System.out.println(soma);

    }
}
/*
beecrowd: Soma de Ímpares Consecutivos (1071)

Lembrete:
O problema não diz quem é maior (X ou Y).
 - Tive que criar variáveis 'min' e 'max' e usar if/else para organizar antes de começar.

O intervalo é "ENTRE" eles (não inclui as pontas).
 - Por isso o for começa em 'min + 1' e vai até '< max'.

Java com numeros negativos:
 - Resto de divisão de negativo pode dar -1.
 - Por isso usei (i % 2 != 0) em vez de (i % 2 == 1).

+explicação (visual)
[10] -- [11] -- [12] -- [13] -- [14] -- [15]

min + 1: Faz começar no 11.

i < max: Faz parar no 14 (porque no 15 ele da ruim).

*/
