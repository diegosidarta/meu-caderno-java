import java.util.Scanner;

public class ex_vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] valores = new int[N];

        for (int i = 0; i < N; i++) {
            valores[i] = sc.nextInt(); //Faz a leitura dos numeros inteiros armazenando-os no vetor
        }
        for (int i = 0; i < N; i++) {
            if (valores[i] < 0) { //Nem toda estrutura condicional precisa terminar com else
                System.out.println(valores[i]);
            }
        }
        sc.close();
    }
}
