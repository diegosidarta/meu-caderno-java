import java.util.Locale;
import java.util.Scanner;

public class vetor08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] altura = new double[N];
        char[] sexo = new char[N];

        for (int i=0; i<N; i++){
            altura[i] = sc.nextDouble();
            sexo[i] = sc.next().charAt(0);
        }

        // --- LÓGICA DO MAIOR E MENOR ---
        // Dica: Inicializamos com o primeiro valor do vetor [0]
        double maiorAltura = altura[0];
        double menorAltura = altura[0];

        for (int i=1; i<N; i++){
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }

        System.out.println("Menor altura = " + menorAltura);
        System.out.println("Maior altura = " + maiorAltura);

        // --- LÓGICA DE GÊNERO ---
        // Precisamos de variáveis auxiliares para guardar as somas
        double somaAlturaMulheres = 0.0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i=0; i<N; i++) {
            // Verifica se é mulher
            if (sexo[i] == 'F') {
                somaAlturaMulheres += altura[i];
                qtdMulheres++;
            }
            else { // Se não é mulher, é homem
                qtdHomens++;
            }
        }

        // Cálculo da média (Proteção contra divisão por zero é opcional mas recomendada)
        if (qtdMulheres > 0) {
            double mediaAlturaF = somaAlturaMulheres / qtdMulheres;
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaF);
        } else {
            System.out.println("Não há mulheres cadastradas.");
        }

        System.out.println("Numero de homens = " + qtdHomens);

        sc.close();
    }
}
