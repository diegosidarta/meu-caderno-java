import java.util.Scanner;
public class tabuada_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tabuada
        int N = sc.nextInt();
        //De 1 até 10 (i=1; i<=10;)
        for(int i=1; i <=10; i++ ){
            int produto = i * N;
            System.out.println(i + "x" + N + "=" + produto);
        }

        sc.close();
    }
}
