import java.util.Scanner;

public class SomarDiagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];

        // Leitura da matriz 3x3
        System.out.println("Digite os 9 valores da matriz 3x3 (linha por linha):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            somaPrincipal += m[i][i];         // diagonal principal: (0,0), (1,1), (2,2)
            somaSecundaria += m[i][2 - i];    // diagonal secundária: (0,2), (1,1), (2,0)
        }

        // Evitar contar o elemento do centro duas vezes ao somar as duas diagonais
        int elementoCentral = m[1][1];
        int somaTotalSemDuplicarCentro = somaPrincipal + somaSecundaria - elementoCentral;

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        System.out.println("Soma das duas diagonais (sem duplicar o centro): " + somaTotalSemDuplicarCentro);
    }
}