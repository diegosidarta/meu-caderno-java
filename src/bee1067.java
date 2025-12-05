import java.util.Scanner;
public class bee1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.*/
        int x = sc.nextInt(); //o valor inserido será a condição da estrutura

        for (int i=1; i<=x; i++){
            if(i % 2 != 0){ //testar se é impar.
                System.out.println(i);
            }
        }

    }
}
