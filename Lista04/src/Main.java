import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
