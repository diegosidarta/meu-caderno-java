import java.util.Scanner;
import java.util.Locale;
public class bee1116 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y != 0) { //logica do guardião
                double divisao = (double) x / y;
                System.out.printf("%.1f%n",divisao);
            }
            else {
                System.out.println("divisao impossivel");
            }
        }

        sc.close();
    }
}
