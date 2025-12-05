import java.util.Scanner;
public class bee1115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*DESAFIO: Quadrante (Loop com condição de parada composta)*/

        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0){
            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            else if (X < 0 && Y > 0){
                System.out.println("segundo");
            }
            else if (X < 0 && Y < 0){
                System.out.println("terceiro");
            }
            else{
                System.out.println("quarto");
            }
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();

    }
}
/*Lógica do "porteiro":
while (x != 0 && y != 0) -> Se qualquer um for 0, a condição inteira vira Falsa
e o programa encerra (pois é impossível determinar quadrante se estiver sobre um eixo).*/