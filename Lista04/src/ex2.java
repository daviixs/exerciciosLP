public class ex2{
    public static void main(String[] args) {
        int vetor[] = new int[10];
        for (int i=0;i<10;i++) {
            vetor[i] = (int) (Math.random() * 10);
        }

        for(int i=0;i<10;i++){
            System.out.print(vetor[i] + " ");
        }
    }
}