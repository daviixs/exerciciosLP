import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        float saldo = 1000;
        String[] vetor = new String[100];
        int indice = 0;
        do{
            System.out.println("===== MENU BANCÁRIO =====");
            System.out.println(" 1 - Consultar o Saldo \n 2 - Depositar \n 3 - Sacar \n 4 - Ver Extrato \n 0 - Sair");
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Seu saldo é de R$" + saldo);
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?");
                    float x = input.nextInt();
                    saldo = saldo + x;
                    vetor[indice] = "Deposito de R" + x;
                    indice++;
                    break;
                case 3:
                    System.out.println("Quanto deseja sacar?");
                    float y  = input.nextInt();
                    if (saldo >= y){
                        saldo = saldo - y;
                        vetor[indice] = "SAQUE de R" + y;
                        indice++;
                    }
                    else System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    for(int i = 0; i < vetor.length; i++){
                        System.out.println(vetor[i]);
                    }
                    break;
                case 0:
                    System.out.println("O sistema será encerrado!");
                    break;
                default: System.out.println("Opção Inválida");

            }
        }
        while(opcao != 0);
    }
}