import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[3];
        int[] vetor2 = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            vetor2[i] = vetor[i] * 2;
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.println(vetor2[i]);
        }

        sc.close();
    }
}