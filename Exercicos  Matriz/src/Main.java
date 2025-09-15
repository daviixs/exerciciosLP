import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        for(int i = 0; i < mat.length; i++){
            System.out.println("Informa os valores da Linha " + (i+1));
            for(int j = 0; j < mat[i].length; j++){
                System.out.println("Informa os valores da Coluna" + (j+1));
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}