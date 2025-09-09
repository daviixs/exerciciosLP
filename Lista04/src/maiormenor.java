import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class maiormenor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Menu de Exercícios com Vetores (Sem OO) ===");
            System.out.println("1) Cadastro e Impressão de Números (10 inteiros)");
            System.out.println("2) Dobro dos Elementos (5 inteiros)");
            System.out.println("3) Maior e Menor Valor (8 reais)");
            System.out.println("4) Notas da Turma (10 alunos)");
            System.out.println("5) Pesquisa em Vetor (15 inteiros)");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");

            String opcaoStr = sc.nextLine().trim();
            int opcao;
            try {
                opcao = Integer.parseInt(opcaoStr);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            switch (opcao) {
                case 1: {
                    System.out.println("\n[Exercício 1] Cadastro e Impressão de 10 números inteiros");
                    int[] v = new int[10];
                    for (int i = 0; i < v.length; i++) {
                        while (true) {
                            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                            String s = sc.nextLine().trim();
                            try {
                                v[i] = Integer.parseInt(s);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número inteiro.");
                            }
                        }
                    }
                    System.out.println("Números digitados: " + Arrays.toString(v));
                    break;
                }

                case 2: {
                    System.out.println("\n[Exercício 2] Dobro dos Elementos (5 inteiros)");
                    int[] v = new int[5];
                    for (int i = 0; i < v.length; i++) {
                        while (true) {
                            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                            String s = sc.nextLine().trim();
                            try {
                                v[i] = Integer.parseInt(s);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número inteiro.");
                            }
                        }
                    }
                    int[] dobro = new int[v.length];
                    for (int i = 0; i < v.length; i++) {
                        dobro[i] = v[i] * 2;
                    }
                    System.out.println("Vetor original: " + Arrays.toString(v));
                    System.out.println("Vetor dobro:    " + Arrays.toString(dobro));
                    break;
                }

                case 3: {
                    System.out.println("\n[Exercício 3] Maior e Menor Valor (8 números reais)");
                    double[] v = new double[8];
                    for (int i = 0; i < v.length; i++) {
                        while (true) {
                            System.out.print("Digite o " + (i + 1) + "º número real: ");
                            String s = sc.nextLine().trim();
                            try {
                                v[i] = Double.parseDouble(s);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número real (use ponto como separador decimal).");
                            }
                        }
                    }

                    double maior = v[0], menor = v[0];
                    int idxMaior = 0, idxMenor = 0;
                    for (int i = 1; i < v.length; i++) {
                        if (v[i] > maior) {
                            maior = v[i];
                            idxMaior = i;
                        }
                        if (v[i] < menor) {
                            menor = v[i];
                            idxMenor = i;
                        }
                    }

                    System.out.println("Vetor: " + Arrays.toString(v));
                    System.out.printf("Maior valor: %.4f (índice %d)%n", maior, idxMaior);
                    System.out.printf("Menor valor: %.4f (índice %d)%n", menor, idxMenor);
                    break;
                }

                case 4: {
                    System.out.println("\n[Exercício 4] Notas da Turma (10 alunos)");
                    double[] notas = new double[10];
                    for (int i = 0; i < notas.length; i++) {
                        while (true) {
                            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
                            String s = sc.nextLine().trim();
                            try {
                                notas[i] = Double.parseDouble(s);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número real (use ponto como separador decimal).");
                            }
                        }
                    }

                    double soma = 0.0;
                    for (double n : notas) soma += n;
                    double media = soma / notas.length;

                    System.out.printf("Média da turma: %.4f%n", media);

                    System.out.print("Alunos acima da média (índices): ");
                    boolean algum = false;
                    for (int i = 0; i < notas.length; i++) {
                        if (notas[i] > media) {
                            System.out.print(i + " ");
                            algum = true;
                        }
                    }
                    if (!algum) {
                        System.out.print("(nenhum)");
                    }
                    System.out.println();
                    break;
                }

                case 5: {
                    System.out.println("\n[Exercício 5] Pesquisa em Vetor (15 inteiros)");
                    int[] v = new int[15];
                    for (int i = 0; i < v.length; i++) {
                        while (true) {
                            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                            String s = sc.nextLine().trim();
                            try {
                                v[i] = Integer.parseInt(s);
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Valor inválido. Digite um número inteiro.");
                            }
                        }
                    }

                    int alvo;
                    while (true) {
                        System.out.print("Digite o número a ser buscado: ");
                        String s = sc.nextLine().trim();
                        try {
                            alvo = Integer.parseInt(s);
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Valor inválido. Digite um número inteiro.");
                        }
                    }

                    StringBuilder posicoes = new StringBuilder();
                    for (int i = 0; i < v.length; i++) {
                        if (v[i] == alvo) {
                            if (posicoes.length() > 0) posicoes.append(", ");
                            posicoes.append(i);
                        }
                    }

                    if (posicoes.length() == 0) {
                        System.out.println("Número não encontrado.");
                    } else {
                        System.out.println("Número encontrado nas posições (índices): " + posicoes);
                    }
                    break;
                }

                case 0:
                    System.out.println("Encerrando. Até mais!");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}