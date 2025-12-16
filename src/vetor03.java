import java.util.Scanner;
public class vetor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N]; // C tem que ter o mesmo tamanho de A e B

        // Registro de dados A
        for (int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        // Registro de dados B
        for (int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }
        // Registro de dados C
        for (int i=0; i<N; i++){
            C[i] = A[i] + B[i]; // O vetor C é a soma dos VALORES que moram nos índices de A e B
        }

        // Exibição do vetor C
        for (int i=0; i<N; i++){
            System.out.print(C[i] + " ");
        }
        sc.close();
    }
}
/*
Ilustração da lógica que acontece na soma dos valores que estão nos índices:

Endereço (Índice):      [0]       [1]       [2]
------------------------------------------------
Vetor A (Conteúdo):    ( 8 )     ( 4 )     ( 10 )
                         +         +         +
Vetor B (Conteúdo):    ( 2 )     ( 5 )     ( 1  )
                         =         =         =
------------------------------------------------
Vetor C (Resultado):   ( 10 )    ( 9 )     ( 11 )

*/