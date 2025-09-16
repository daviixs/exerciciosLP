public class SomandoMatrizes3x3 {
    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] soma = new int[3][3];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                mat2[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("Matriz A (3x3):");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                System.out.print(mat2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz B (3x3):");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                soma[0][j] = + mat[0][j] + mat2[0][j];
            }
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                soma[1][j] = + mat[1][j] + mat2[1][j];
            }
        }

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[i].length; j++) {
                soma[2][j] = + mat[2][j] + mat2[2][j];
            }
        }

        System.out.println("Soma das matrizes:");
        for (int i = 0; i < soma.length; i++) {
            for (int j = 0; j < soma[i].length; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
