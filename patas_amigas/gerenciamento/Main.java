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

            switch (op) {
                case 1:
                    pessoas.add(gerenciarPessoa());

                    break;
                case 2:
                    gerarRelatorio(pessoas);
                    break;
                case 3:
                    condicao = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
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

        System.out.println("Digite se você é funcionario [0 = não, 1 = sim]: ");
        int op = scan.nextInt();
        while (op != 0 || op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é funcionario [0 = não, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleF = (op == 0) ? false : true;

        System.out.println("Digite se você é adotante [0 = não, 1 = sim]: ");
        op = scan.nextInt();
        while (op != 0 || op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é adotante [0 = não, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleA = (op == 0) ? false : true;

        System.out.println("Digite se você é tutor [0 = não, 1 = sim]: ");
        op = scan.nextInt();
        while (op != 0 || op != 1) {
            System.out.println("opção inválida! digite novamente.");

            System.out.println("Digite se você é tutor [0 = não, 1 = sim]: ");
            op = scan.nextInt();
        }
        boolean roleT = (op == 0) ? false : true;

        Pessoa p = new Pessoa(nome, cpf, dataNasc, email, senha, endereco, tel, genero, true, roleF, roleA, roleT);
        objetosPessoa.add(p);

        if (roleF) {
            Funcionario func = gerenciarFuncionario(p);
        }

        if (roleA) {
            Adotante adotante = gerenciarAdotante(p);
        }

        if (roleT) {
            Tutor tutor = gerenciarTutor(p);
        }

    }

    public static Funcionario gerenciarFuncionario(Pessoa p) {
        System.out.println("Digite sua data de contratação: ");
        String dataContratacao = scan.nextLine();

        System.out.println("Digite seu cargo: ");
        String cargo = scan.nextLine();

        System.out.println("Digite seu salário: ");
        double salario = scan.nextDouble();

        System.out.println("Digite seu departamento: ");
        String departamento = scan.nextLine();

        Funcionario funcionario = new Funcionario(p, dataContratacao, cargo, salario, departamento);

        return funcionario;
    }

    public static Adotante gerenciarAdotante(Pessoa p) {
        return null;
    }

    public static Tutor gerenciarTutor(Pessoa p) {
        return null;
    }

    public static void gerarRelatorio(List<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}
