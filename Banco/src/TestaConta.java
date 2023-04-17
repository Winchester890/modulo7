import java.util.Scanner;

public class TestaConta {
    static ContaCorrente cc1 = new ContaCorrente(22, 77, "Bradesco", 10000.00, 2000.00);
    static ContaPoupanca cp1 = new ContaPoupanca(11, 181, "Santander", 10000.00, 22, 0.1);
    static ContaSalario cs1 = new ContaSalario(32, 12, "Itaú", 10000.00, 5000.00);
    static double saqueCc = 0;
    static double depositoCc = 0;
    static double saqueCp = 0;
    static double depositoCp = 0;
    static double saqueCs = 0;
    static double depositoCs = 0;
    static double saldoCc = 0;
    static double saldoCp = 0;
    static double saldoCs = 0;
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("------ Operações bancárias ------");
            System.out.println(" ");
            System.out.println("1 - Acessar Conta Corrente");
            System.out.println("2 - Acessar Conta Poupança");
            System.out.println("3 - Acessar Conta Salário");
            System.out.println("4 - Mostrar saldo Conta Corrente");
            System.out.println("5 - Mostrar saldo Conta Poupança");
            System.out.println("6 - Mostrar saldo Conta Salário");
            System.out.println("0 - Sair");
            System.out.print("Qual operação você deseja realizar? ");
            opcao = Integer.parseInt(scanner.next());

            menu(opcao);
        } while (opcao != 0);
    }
    public static void menu(int opcao) throws Exception {
        int limite = 0;
        int N;
        String resposta = null;
        Scanner scanner = new Scanner(System.in);
        switch (opcao) {
            case 1:
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.print("Qual operação você deseja realizar? ");
                N = Integer.parseInt(scanner.next());
                if (N == 1) {
                    System.out.print("Digite a quantia a ser sacada: ");
                    double saque = Double.parseDouble(scanner.next());
                    saqueCc = saqueCc + saque;
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta.equals("s")) {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saqueCc = saqueCc + saque;
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (!resposta.equals("n") || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    double deposito = Double.parseDouble(scanner.next());
                    depositoCc = depositoCc + deposito;
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                saldoCc = depositoCc - saqueCc;
                break;
            case 2:
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.print("Qual operação você deseja realizar? ");
                N = Integer.parseInt(scanner.next());
                if (N == 1) {
                    System.out.print("Digite a quantia a ser sacada: ");
                    double saque = Double.parseDouble(scanner.next());
                    saqueCp = saqueCp + saque;
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta.equals("s")) {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saqueCp = saqueCp + saque;
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (!resposta.equals("n") || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    double deposito = Double.parseDouble(scanner.next());
                    depositoCp = depositoCp + deposito;
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                saldoCp = depositoCp - saqueCp;
                break;
            case 3:
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.print("Qual operação você deseja realizar? ");
                N = Integer.parseInt(scanner.next());
                if (N == 1) {
                    System.out.print("Digite a quantia a ser sacada: ");
                    double saque = Double.parseDouble(scanner.next());
                    saqueCs = saqueCs + saque;
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta.equals("s")) {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saqueCs = saqueCs + saque;
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (!resposta.equals("n") || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    double deposito = Double.parseDouble(scanner.next());
                    depositoCs = depositoCs + deposito;
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                saldoCs = depositoCs - saqueCs;
                break;
            case 4:
                System.out.println("Saldo atual da Conta Corrente:");
                System.out.println("R$" + cc1.getSaldo());
                System.out.println("Extrato das operações realizadas anteriormente: " + saldoCc);
                break;
            case 5:
                System.out.println("Saldo atual da Conta Poupança:");
                System.out.println("R$" + cp1.getSaldo());
                System.out.println("Extrato das operações realizadas anteriormente: " + saldoCp);
                break;
            case 6:
                System.out.println("Saldo atual da Conta Salário:");
                System.out.println("R$" + cs1.getSaldo());
                System.out.println("Extrato das operações realizadas anteriormente: " + saldoCs);
                break;
            case 0:
                System.out.println("Operações encerradas!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}

