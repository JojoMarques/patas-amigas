package patas_amigas.gerenciamento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import patas_amigas.atores.Adotante;
import patas_amigas.atores.Funcionario;
import patas_amigas.atores.Pessoa;
import patas_amigas.atores.Tutor;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<Pessoa> pessoas = new ArrayList<>();
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static ArrayList<Tutor> tutores = new ArrayList<>();
    static ArrayList<Adotante> adotantes = new ArrayList<>();

    public static void main(String[] args) {
        // funcionario, tutor, adotante, animal.
        // aí, pra cada um: criar o objeto
        System.out.println("Bem-vindo ao Patas Amigas ");
        boolean condicao = true;

        while (condicao) {

            System.out.println("\nEscolha qual deseja gerenciar: ");
            System.out.println("1. Gerenciar pessoas");
            System.out.println("2. Listar pessoas");
            System.out.println("3. Saída");
            int op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 1:
                ArrayList<Pessoa> listaObjetosPessoa = gerenciarPessoa();

                    Pessoa p = listaObjetosPessoa.get(0);

                    pessoas.add(p);

                    for (Pessoa el : listaObjetosPessoa) {
                        if (el instanceof Funcionario) {
                            funcionarios.add((Funcionario) el);

                        } else if (el instanceof Adotante) {
                            adotantes.add((Adotante) el);

                        } else if (el instanceof Tutor) {
                            tutores.add((Tutor) el);
                        }
                    }
                    break;
                case 2:
                    gerarRelatorio(pessoas, funcionarios, adotantes, tutores);
                    break;
                case 3:
                    condicao = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
        System.out.println("tchau tchau :)");
    }

    public static ArrayList<Pessoa> gerenciarPessoa() {

        ArrayList<Pessoa> objetosPessoa = new ArrayList<>();

        System.out.println("Digite seu nome completo: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scan.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        String dataNasc = scan.nextLine();

        System.out.println("Digite seu email: ");
        String email = scan.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        System.out.println("Digite seu telefone: ");
        String tel = scan.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scan.nextLine();

        System.out.println("Digite seu gênero: ");
        String genero = scan.nextLine();

        System.out.println("Digite se você é funcionario [0 = nao, 1 = sim]: ");
        int op = scan.nextInt();
        while (op != 0 && op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é funcionario [0 = nao, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleF = (op == 0) ? false : true;

        System.out.println("Digite se você é adotante [0 = nao, 1 = sim]: ");
        op = scan.nextInt();
        while (op != 0 && op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é adotante [0 = nao, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleA = (op == 0) ? false : true;

        System.out.println("Digite se você é tutor [0 = nao, 1 = sim]: ");
        op = scan.nextInt();
        while (op != 0 && op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é tutor [0 = nao, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleT = (op == 0) ? false : true;
        scan.nextLine();
        
        Pessoa p = new Pessoa(nome, cpf, dataNasc, email, senha, endereco, tel, genero, true, roleF, roleA, roleT);
        objetosPessoa.add(p);

        if (roleF) {
            Funcionario func = gerenciarFuncionario(p);
            objetosPessoa.add(func);
        }

        if (roleA) {
            Adotante adotante = gerenciarAdotante(p);
            objetosPessoa.add(adotante);
        }

        if (roleT) {
            Tutor tutor = gerenciarTutor(p);
            objetosPessoa.add(tutor);

        }

        return objetosPessoa;

    }

    public static Funcionario gerenciarFuncionario(Pessoa p) {
        System.out.println("Digite sua data de contratação: ");
        String dataContratacao = scan.nextLine();

        System.out.println("Digite seu cargo: ");
        String cargo = scan.nextLine();

        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();
        scan.nextLine();

        System.out.println("Digite seu departamento: ");
        String departamento = scan.nextLine();

        Funcionario funcionario = new Funcionario(p, dataContratacao, cargo, salario, departamento);

        return funcionario;
    }

    public static Adotante gerenciarAdotante(Pessoa p) {
        System.out.println("Digite sua preferência para adoção:");
        String preferencia = scan.nextLine();

        ArrayList<String> historicoAdocoes_adotante = new ArrayList<>();

        Adotante adotante = new Adotante(p, preferencia, historicoAdocoes_adotante);
        return adotante;
    }

    public static Tutor gerenciarTutor(Pessoa p) {
        System.out.println("Digite a quantidade de animas mantidas sob custódia: ");
        int numAnimais_custodia = scan.nextInt();

        ArrayList<Object> historicoAdocoes_tutor = new ArrayList<>();

        Tutor tutor = new Tutor(p, numAnimais_custodia, historicoAdocoes_tutor);

        return tutor;
    }

    public static void gerarRelatorio(List<Pessoa> pessoas, List<Funcionario> funcionarios, List<Adotante> adotantes,
            List<Tutor> tutores) {
        System.out.println("O que você deseja exibir?");
        System.out.println("1.Todas as pessoas");
        System.out.println("2.Todos os funcionários");
        System.out.println("3.Todos os adotantes");
        System.out.println("4.Todos os tutores");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                for (Pessoa p : pessoas) {
                    System.out.println(p);
                }
                break;
            case 2:
                for (Funcionario f : funcionarios) {
                    System.out.println(f);
                }
                break;
            case 3:
                for (Adotante a : adotantes) {
                    System.out.println(a);
                }
                break;
            case 4:
                for (Tutor t : tutores) {
                    System.out.println(t);
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

    }
}
