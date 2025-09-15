import java.util.Scanner;

public class novoExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[5];
        int[] vet2 = new int[5];
        int[] vetPrincipal =  new int[5];

        System.out.println("Digite os numeros do vetor A");
        for(int i=0; i<5; i++){
            vet2[i] = sc.nextInt();
        }

        System.out.println("Digite os numeros do vetor B");
        for(int i=0; i<5; i++){
            vet1[i] = sc.nextInt();
        }
        int iA = 0;
        int iB = 0;
        for(int i=0; i<10; i++){

            if(1 % 2==0){
                vetPrincipal[i] = vet1[iA]; iA++;
            }
            else{
                vetPrincipal[i] = vet2[iB]; iB++;
            }
        }

        for(int i=0; i<5; i++){
            System.out.print(" "+vet1[i]+ " ");
        }
    }
}
