import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        int[] vet = new int[15];

        for(int i = 0; i < vet.length; i++){
            vet[i] = (int) (Math.random() * 21);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para pesquisa: ");
        int pesquisa = sc.nextInt();

        for(int i = 0; i < vet.length; i++){
            if(vet[i] == pesquisa){
                System.out.println("ELemento encontrado na posição: " + i);
            }
        }
    }
}
