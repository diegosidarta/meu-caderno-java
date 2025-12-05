import java.util.Scanner;
public class break_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++){
            if(i>25){
                break;
            }
            System.out.println(i);
        }

    }
}
