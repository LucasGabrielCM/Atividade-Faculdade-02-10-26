import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 13) {

            System.out.println("\nDigite qual atividade você quer acessar:");
            System.out.println("Atividade 1");
            System.out.println("Atividade 2");
            System.out.println("Atividade 3");
            System.out.println("Atividade 4");
            System.out.println("Atividade 5");
            System.out.println("Atividade 6");
            System.out.println("Atividade 7");
            System.out.println("Atividade 8");
            System.out.println("Atividade 9");
            System.out.println("Atividade 10");
            System.out.println("Atividade 11");
            System.out.println("Atividade 12");
            System.out.println("Sair - 13");

            System.out.print("Digite sua opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Atividade 1");

                    int num1, num2, operacao;
                    int continuar = 1;

                    while (continuar == 1) {

                        System.out.println("\nEscolha a operação:");
                        System.out.println("1 - Soma");
                        System.out.println("2 - Subtração");
                        System.out.println("3 - Multiplicação");
                        System.out.println("4 - Divisão inteira");

                        System.out.print("Digite a opção: ");
                        operacao = entrada.nextInt();

                        System.out.print("Digite o primeiro número: ");
                        num1 = entrada.nextInt();

                        System.out.print("Digite o segundo número: ");
                        num2 = entrada.nextInt();

                        switch (operacao) {

                            case 1:
                                System.out.println("Resultado: " + (num1 + num2));
                                break;

                            case 2:
                                System.out.println("Resultado: " + (num1 - num2));
                                break;

                            case 3:
                                System.out.println("Resultado: " + (num1 * num2));
                                break;

                            case 4:
                                if (num2 != 0) {
                                    System.out.println("Resultado: " + (num1 / num2));
                                } else {
                                    System.out.println("Erro: não é possível dividir por zero!");
                                }
                                break;

                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }

                        System.out.println("\nDeseja realizar outra operação?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        System.out.print("Escolha: ");
                        continuar = entrada.nextInt();
                    }

                    break;

                case 2:

                    System.out.println("Atividade 2");

                    int soma = 0;

                    for (int numero = 1; numero <= 500; numero++) {

                        if (numero % 2 != 0 && numero % 3 == 0) {
                            soma = soma + numero;
                        }
                    }

                    System.out.println("A soma dos números ímpares múltiplos de 3 é: " + soma);

                    break;

                case 3:

                    System.out.println("Atividade 3");

                    int numeroEmpregado;
                    int mesesTrabalho;

                    int empregadoRecente = 0;
                    int empregadoAntigo = 0;

                    int maiorMeses = 0;
                    int menorMeses = 301;

                    while (true) {

                        System.out.println("Digite (0) nas opções para encerrar");

                        System.out.print("Digite o número do empregado: ");
                        numeroEmpregado = entrada.nextInt();

                        System.out.print("Digite os meses de trabalho: ");
                        mesesTrabalho = entrada.nextInt();

                        if (numeroEmpregado == 0 && mesesTrabalho == 0) {
                            break;
                        }

                        if (mesesTrabalho > maiorMeses) {
                            maiorMeses = mesesTrabalho;
                            empregadoAntigo = numeroEmpregado;
                        }

                        if (mesesTrabalho < menorMeses) {
                            menorMeses = mesesTrabalho;
                            empregadoRecente = numeroEmpregado;
                        }
                    }

                    System.out.println("Empregado mais antigo: " + empregadoAntigo);
                    System.out.println("Empregado mais recente: " + empregadoRecente);

                    break;

                case 4:

                    System.out.println("Atividade 4");

                    double altura;
                    double menorAltura = 999;
                    double somaMulheres = 0;
                    int quantidadeMulheres = 0;
                    int quantidadeHomens = 0;

                    double maiorAltura = 0;
                    char sexoMaisAlto = ' ';

                    for (int pessoa = 1; pessoa <= 15; pessoa++) {

                        System.out.print("Digite a altura da pessoa " + pessoa + ": ");
                        altura = entrada.nextDouble();

                        System.out.print("Digite o sexo (M/F): ");
                        char sexo = entrada.next().charAt(0);

                        if (altura < menorAltura) {
                            menorAltura = altura;
                        }

                        if (sexo == 'F') {
                            somaMulheres = somaMulheres + altura;
                            quantidadeMulheres++;
                        }

                        if (sexo == 'M') {
                            quantidadeHomens++;
                        }

                        if (altura > maiorAltura) {
                            maiorAltura = altura;
                            sexoMaisAlto = sexo;
                        }
                    }

                    if (quantidadeMulheres > 0) {
                        double mediaMulheres = somaMulheres / quantidadeMulheres;
                        System.out.println("Média de altura das mulheres: " + mediaMulheres);
                    } else {
                        System.out.println("Não existem mulheres no grupo.");
                    }

                    System.out.println("Menor altura do grupo: " + menorAltura);
                    System.out.println("Número de homens: " + quantidadeHomens);
                    System.out.println("Sexo da pessoa mais alta: " + sexoMaisAlto);

                    break;

                case 5:

                    System.out.println("Atividade 5");

                    double salario;
                    int filhos;

                    double somaSalarios = 0;
                    int somaFilhos = 0;
                    int quantidadePessoas = 0;
                    int pessoasAte250 = 0;
                    double maiorSalario = 0;

                    System.out.print("Digite o salário: ");
                    salario = entrada.nextDouble();

                    while (salario >= 0) {

                        System.out.print("Digite o número de filhos: ");
                        filhos = entrada.nextInt();

                        somaSalarios = somaSalarios + salario;
                        somaFilhos = somaFilhos + filhos;
                        quantidadePessoas++;

                        if (salario > maiorSalario) {
                            maiorSalario = salario;
                        }

                        if (salario <= 250) {
                            pessoasAte250++;
                        }

                        System.out.print("Digite o salário: ");
                        salario = entrada.nextDouble();
                    }

                    if (quantidadePessoas > 0) {

                        double mediaSalario = somaSalarios / quantidadePessoas;
                        double mediaFilhos = (double) somaFilhos / quantidadePessoas;
                        double percentual = (pessoasAte250 * 100.0) / quantidadePessoas;

                        System.out.println("Média do salário: R$ " + mediaSalario);
                        System.out.println("Média de filhos: " + mediaFilhos);
                        System.out.println("Maior salário: R$ " + maiorSalario);
                        System.out.println("Percentual de pessoas com salário até R$250,00: " + percentual);

                    } else {
                        System.out.println("Nenhuma pessoa foi cadastrada.");
                    }

                    break;

                case 6:

                    System.out.println("Atividade 6");

                    double valor;
                    double soma6 = 0;

                    int quantidade = 0;
                    int positivos = 0;
                    int negativos = 0;
                    int opcao6 = 1;

                    while (opcao6 == 1) {

                        System.out.print("Digite um valor: ");
                        valor = entrada.nextDouble();

                        soma6 = soma6 + valor;
                        quantidade++;

                        if (valor > 0) {
                            positivos++;
                        }

                        if (valor < 0) {
                            negativos++;
                        }

                        System.out.println("1 - Digitar outro valor");
                        System.out.println("2 - Finalizar");
                        System.out.print("Escolha: ");
                        opcao6 = entrada.nextInt();
                    }

                    if (quantidade > 0) {

                        double media = soma6 / quantidade;
                        double percentualPositivos = (positivos * 100.0) / quantidade;
                        double percentualNegativos = (negativos * 100.0) / quantidade;

                        System.out.println("Média aritmética: " + media);
                        System.out.println("Quantidade de positivos: " + positivos);
                        System.out.println("Quantidade de negativos: " + negativos);
                        System.out.println("Percentual de positivos: " + percentualPositivos);
                        System.out.println("Percentual de negativos: " + percentualNegativos);
                    }

                    break;

                case 7:

                    System.out.println("Atividade 7");

                    int soma7 = 0;
                    int quantidade7 = 75;

                    for (int i = 1; i <= quantidade7; i++) {

                        System.out.print("Digite o " + i + "º valor: ");
                        int valor7 = entrada.nextInt();

                        soma7 = soma7 + valor7;
                    }

                    double media7 = (double) soma7 / quantidade7;

                    System.out.println("Quantidade de números lidos: " + quantidade7);
                    System.out.println("Média dos valores: " + media7);

                    break;

                case 8:

                    System.out.println("Atividade 8");

                    String nome8;
                    double altura8;
                    int sexo8;

                    String nomeMaior8 = "";
                    String nomeMenor8 = "";

                    double maiorAltura8 = 0;
                    double menorAltura8 = 999;

                    double somaHomens8 = 0;
                    double somaMulheres8 = 0;
                    double somaTurma8 = 0;

                    int quantidadeHomens8 = 0;
                    int quantidadeMulheres8 = 0;

                    for (int pessoa8 = 1; pessoa8 <= 15; pessoa8++) {

                        System.out.print("Digite o nome da pessoa " + pessoa8 + ": ");
                        nome8 = entrada.next();

                        System.out.print("Digite a altura: ");
                        altura8 = entrada.nextDouble();

                        System.out.print("Digite o sexo (1 = masculino / 2 = feminino): ");
                        sexo8 = entrada.nextInt();

                        if (altura8 > maiorAltura8) {
                            maiorAltura8 = altura8;
                            nomeMaior8 = nome8;
                        }

                        if (altura8 < menorAltura8) {
                            menorAltura8 = altura8;
                            nomeMenor8 = nome8;
                        }

                        somaTurma8 = somaTurma8 + altura8;

                        if (sexo8 == 1) {
                            somaHomens8 = somaHomens8 + altura8;
                            quantidadeHomens8++;
                        }

                        if (sexo8 == 2) {
                            somaMulheres8 = somaMulheres8 + altura8;
                            quantidadeMulheres8++;
                        }
                    }

                    double mediaTurma8 = somaTurma8 / 15;

                    System.out.println("\nMaior altura: " + maiorAltura8);
                    System.out.println("Nome: " + nomeMaior8);

                    System.out.println("\nMenor altura: " + menorAltura8);
                    System.out.println("Nome: " + nomeMenor8);

                    if (quantidadeHomens8 > 0) {
                        double mediaHomens8 = somaHomens8 / quantidadeHomens8;
                        System.out.println("\nMédia de altura dos homens: " + mediaHomens8);
                    } else {
                        System.out.println("\nNão existem homens na turma.");
                    }

                    if (quantidadeMulheres8 > 0) {
                        double mediaMulheres8 = somaMulheres8 / quantidadeMulheres8;
                        System.out.println("Média de altura das mulheres: " + mediaMulheres8);
                    } else {
                        System.out.println("Não existem mulheres na turma.");
                    }

                    System.out.println("Média de altura da turma: " + mediaTurma8);

                    break;

                case 9:

                    System.out.println("Atividade 9");

                    int quantidadeAlunos9;

                    double nota9;
                    double maiorNota9 = 0;
                    double menorNota9 = 15;

                    System.out.print("Digite o número de alunos: ");
                    quantidadeAlunos9 = entrada.nextInt();

                    for (int aluno9 = 1; aluno9 <= quantidadeAlunos9; aluno9++) {

                        System.out.print("Digite a nota do aluno " + aluno9 + ": ");
                        nota9 = entrada.nextDouble();

                        if (nota9 > maiorNota9) {
                            maiorNota9 = nota9;
                        }

                        if (nota9 < menorNota9) {
                            menorNota9 = nota9;
                        }
                    }

                    System.out.println("Maior nota: " + maiorNota9);
                    System.out.println("Menor nota: " + menorNota9);

                    break;

                case 10:

                    System.out.println("Atividade 10");

                    double centimetros10;

                    System.out.println("Tabela de conversão de polegadas para centímetros:");
                    System.out.println("Polegadas\tCentímetros");

                    for (int polegadas10 = 1; polegadas10 <= 20; polegadas10++) {

                        centimetros10 = polegadas10 * 2.54;

                        System.out.println(polegadas10 + "\t\t" + centimetros10);
                    }

                    break;

                case 11:

                    System.out.println("Atividade 11");

                    int limiteInferior11;
                    int limiteSuperior11;
                    int somaPares11 = 0;

                    System.out.print("Digite o limite inferior: ");
                    limiteInferior11 = entrada.nextInt();

                    System.out.print("Digite o limite superior: ");
                    limiteSuperior11 = entrada.nextInt();

                    for (int numero11 = limiteInferior11; numero11 <= limiteSuperior11; numero11++) {

                        if (numero11 % 2 == 0) {
                            somaPares11 = somaPares11 + numero11;
                        }
                    }

                    System.out.println("A soma dos números pares do intervalo é: " + somaPares11);

                    break;

                case 12:

                    System.out.println("Atividade 12");

                    int matricula12;
                    double nota12;

                    int matriculaMaior12 = 0;
                    int matriculaSegunda12 = 0;

                    double maiorNota12 = 0;
                    double segundaMaior12 = 0;

                    for (int aluno12 = 1; aluno12 <= 100; aluno12++) {

                        System.out.print("Digite a matrícula do aluno " + aluno12 + ": ");
                        matricula12 = entrada.nextInt();

                        System.out.print("Digite a nota: ");
                        nota12 = entrada.nextDouble();

                        if (nota12 > maiorNota12) {

                            segundaMaior12 = maiorNota12;
                            matriculaSegunda12 = matriculaMaior12;

                            maiorNota12 = nota12;
                            matriculaMaior12 = matricula12;

                        } else if (nota12 > segundaMaior12) {

                            segundaMaior12 = nota12;
                            matriculaSegunda12 = matricula12;
                        }
                    }

                    System.out.println("\nMaior nota: " + maiorNota12);
                    System.out.println("Matrícula: " + matriculaMaior12);

                    System.out.println("\nSegunda maior nota: " + segundaMaior12);
                    System.out.println("Matrícula: " + matriculaSegunda12);

                    break;

                case 13:

                    System.out.println("Programa encerrado!");

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;
            }
        }

        entrada.close();
    }
}
