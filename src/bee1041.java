import java.util.Locale;
import java.util.Scanner;
public class bee1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Problema 1041 do beecrowd(Quadrantes/Plano Cartesiano)

        float x, y;

        x = sc.nextFloat();
        y = sc.nextFloat();

        //testando os quadrantes
        if (x > 0f && y > 0f) {
            System.out.println("Q1");
        }
        else if (x < 0f && y > 0f) {
            System.out.println("Q2");
        }
        else if (x < 0f && y < 0f) {
            System.out.println("Q3");
        }
        else if (x > 0f && y < 0f) {
            System.out.println("Q4");
        }
        //testando a Origem (caso mais especifico dos zeros)
        else if (x == 0f && y == 0f) {
            System.out.println("Origem");
        }
        //testando os eixos (se não é Origem, mas tem um zero)
        else if (x == 0f) {
            System.out.println("Eixo Y");
        }
        else {
            System.out.println("Eixo X");
        }

        sc.close();
    }
}
