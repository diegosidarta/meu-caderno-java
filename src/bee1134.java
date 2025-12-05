import java.util.Scanner;

public class bee1134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência dos clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
O programa será encerrado quando o código informado for o número 4.

ENTRADA:
A entrada contém apenas valores inteiros e positivos.

SAÍDA:
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo. */

        int codigo = sc.nextInt();
        int alcool = 0; //contador do alcool
        int gasolina = 0; //contador da gasolina
        int diesel = 0; //contador  do diesel

        while(codigo != 4){
            if(codigo == 1){
                alcool += 1;
            }
            else if(codigo == 2){
                gasolina += 1;
            }
            else if(codigo == 3){
                diesel += 1;
            }
            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
/*
 Sobre a estrutura condicional não ter um 'else' final:
 Usei a estrutura sem 'else' porque o 'resto' (qualquer código diferente de 1, 2, 3 ou 4)
 não é um erro crítico, mas algo irrelevante para a contagem.

 A lógica é: 'Se não for um dos meus combustíveis (1, 2, 3), não faça nada e deixe a fila andar'.
 O programa ignora, volta para o início do while e pede o próximo código na linha 32.
 */