public class ex1 {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            vetor[i] = (int) (Math.random() * 20);
        }
        int menor = vetor[0];
        int posMenor = 0;
        int maior = vetor[0];
        int posMaior = 0;

        for (int i = 1; i < 8; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
            if (vetor[i] < maior) {
                maior = vetor[i];
                posMaior = i;
            }
        }
        System.out.println("Maior elemento" + maior + "na posiçao" + posMaior);
        System.out.println("Menor elemento" + menor + "na posiçao" + posMenor);
    }
}