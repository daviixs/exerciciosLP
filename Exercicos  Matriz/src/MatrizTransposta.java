import java.util.Scanner;

public class MatrizTransposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas = 3;
        int colunas = 2;

        int[][] A = new int[linhas][colunas];
        int[][] T = new int[colunas][linhas];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = (int) (Math.random() * 10);
            }
        }

        // Geração da transposta: T[j][i] = A[i][j]
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                T[j][i] = A[i][j];
            }
        }

        // Exibição da matriz original
        System.out.println("\nMatriz A (3x2):");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Exibição da transposta
        System.out.println("\nMatriz Transposta T (2x3):");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}