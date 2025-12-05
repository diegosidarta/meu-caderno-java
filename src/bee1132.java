import java.util.Scanner;
import java.util.Locale;

public class bee1132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // arrumando a ordem (quem é menor?)
        int min, max;
        if (x < y) {
            min = x;
            max = y;
        }
        else {
            min = y;
            max = x;
        }

        int soma = 0;

        //loop (do menor ao maior)
        for (int i = min; i <= max; i++) {

            //filtro (NÃO é multiplo de 13?)
            if (i % 13 != 0) {
                soma += i; //soma no "cofre"
            }
        }

        System.out.println(soma);
        sc.close();
    }


}

