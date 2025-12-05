import java.util.Scanner;
import java.util.Locale;
public class bee1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 2002){
            System.out.println("Senha Invalida");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();

    }
}
/* O padrão "While" é uma boa opção para validações onde não sabemos quantas vezes
o usuario vai errar.*/