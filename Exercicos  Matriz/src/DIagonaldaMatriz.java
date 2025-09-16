public class DIagonaldaMatriz {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == j){
                    mat[i][j] = 1;
                }
                else{
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("IMpressao da Matriz");
        for(int j = 0; j < mat[0].length; j++) {
            for(int i = 0; i < mat.length; i++){
                System.out.print(mat[i][j]);
            }
        }
    }
}
