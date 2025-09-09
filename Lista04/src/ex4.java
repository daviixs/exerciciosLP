import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0.0;

        System.out.println("Digite as notas dos 10 alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        System.out.println("Média da turma: " + media);

        System.out.println("Alunos acima da média (índices):");
        for (int i = 0; i < 10; i++) {
            if (notas[i] > media) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}