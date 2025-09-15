import java.util.Scanner;

public class SomaDeMatrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declara a matriz 3x3
        int[][] mat = new int[3][3];

        // Leitura da matriz
        for (int i = 0; i < mat.length; i++) {
            System.out.println("Digite os valores da linha " + (i + 1) + ":");
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Coluna " + (j + 1) + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        // Variáveis para guardar a soma de cada linha
        int somaLinha1 = 0;
        int somaLinha2 = 0;
        int somaLinha3 = 0;

        // Soma da linha 1
        for (int j = 0; j < mat[0].length; j++) {
            somaLinha1 += mat[0][j];
        }

        // Soma da linha 2
        for (int j = 0; j < mat[1].length; j++) {
            somaLinha2 += mat[1][j];
        }

        // Soma da linha 3
        for (int j = 0; j < mat[2].length; j++) {
            somaLinha3 += mat[2][j];
        }

        // Imprime os resultadosss
        System.out.println("\nResultado das somas:");
        System.out.println("Soma da linha 1 = " + somaLinha1);
        System.out.println("Soma da linha 2 = " + somaLinha2);
        System.out.println("Soma da linha 3 = " + somaLinha3);

        sc.close();
    }
}