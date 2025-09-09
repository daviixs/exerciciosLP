public class ex3 {
    public static void main(String[] args) {
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];

        for (int i=0; i<5; i++){
            vet1[i] = (int) (Math.random() * 11);
        }
        for (int i=0; i<5; i++){
            vet2[i] = vet1[i] * 2;
        }
        System.out.println("VETOR ORIGINAL");
        for (int i=0; i<5; i++){
            System.out.print(vet1[i]);
        }
        System.out.println("  VETOR RESULTANTE");
        for (int i=0; i<5; i++){
            System.out.print(vet2[i]);
        }
    }
}
