import java.util.Scanner;
import java.util.Locale;
public class bee1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia as notas referentes às duas avaliações de um aluno.
        Calcule e imprima a média semestral.
        Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
        Cada nota deve ser validada separadamente.

        ENTRADA:
        A entrada contém vários valores reais, positivos ou negativos.
        O programa deve ser encerrado quando forem lidas duas notas válidas.

        SAÍDA:
        Se uma nota inválida for lida, deve ser impressa a mensagem "nota invalida".
        Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo.
         O valor deve ser apresentado com duas casas após o ponto decimal.
         */

        double nota1 = sc.nextDouble();
        while (nota1 < 0.0 || nota1 > 10.0) { //tem que checar primeiro SEPARADAMENTE se a nota é valida
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }

        double nota2 = sc.nextDouble();
        while (nota2 < 0.0 || nota2 > 10.0) { //checando se a segunda nota é valida
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }
        //nao foi preciso de um 'contador' pois ja sabemos que sao apenas duas notas.
        double media = (nota1 + nota2) / 2.0;
        System.out.printf("media = %.2f%n", media);


    }
}
