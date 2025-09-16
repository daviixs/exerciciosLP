public class ExercicioMaiorNumero {
    public static void main(String[] args){
        int[][] mat = new int[5][5];

        int numeroMaior = 0;
        int posicao1 = 0;
        int posicao2 = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] >= numeroMaior){
                    numeroMaior = mat[i][j];
                    posicao1 = i;
                    posicao2 = j;
                }
            }
        }
        System.out.println("O maior valor é " + numeroMaior + " na linha " + (posicao1) + " e na coluna " + (posicao2));
    }
}
