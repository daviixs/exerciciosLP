public class ExercicioMedia {
    public static void main(String[] args){
        int[][] mat = new int[3][4];

        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;

        // Preenche com números aleatórios de 0 a 9
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }

        // Soma das linhas
        for (int i = 0; i < mat[0].length; i++) {
            soma1 += mat[0][i];
        }
        for (int i = 0; i < mat[1].length; i++) {
            soma2 += mat[1][i];
        }
        for (int i = 0; i < mat[2].length; i++) {
            soma3 += mat[2][i];
        }

        // Calcula as médias
        double media1 = soma1 / mat[0].length;
        double media2 = soma2 / mat[1].length;
        double media3 = soma3 / mat[2].length;

        // Imprime a matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média da linha 1: " + media1);
        System.out.println("Média da linha 2: " + media2);
        System.out.println("Média da linha 3: " + media3);
    }
}