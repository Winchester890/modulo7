import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TestaConta {
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
        ContaCorrente cc1 = new ContaCorrente(22, 77, "Bradesco", 10000.00, 2000.00);
        ContaPoupanca cp1 = new ContaPoupanca(11, 181, "Santander", 10000.00, 22, 0.1);
        ContaSalario cs1 = new ContaSalario(32, 12, "Itaú", 10000.00, 5000.00);
        List<Double> saquesCc = new ArrayList<>();
        List<Double> depositosCc = new ArrayList<>();
        List<Double> saquesCp = new ArrayList<>();
        List<Double> depositosCp = new ArrayList<>();
        List<Double> saquesCs = new ArrayList<>();
        List<Double> depositosCs = new ArrayList<>();
        double saque;
        double deposito = 0;
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
                    saque = Double.parseDouble(scanner.next());
                    saquesCc.add(saque);
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta == "s") {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saquesCc.add(saque);
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (resposta != "n" || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    deposito = Double.parseDouble(scanner.next());
                    depositosCc.add(deposito);
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                break;
            case 2:
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.print("Qual operação você deseja realizar? ");
                N = Integer.parseInt(scanner.next());
                if (N == 1) {
                    System.out.print("Digite a quantia a ser sacada: ");
                    saque = Double.parseDouble(scanner.next());
                    saquesCp.add(saque);
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta == "s") {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saquesCp.add(saque);
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (resposta != "n" || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    deposito = Double.parseDouble(scanner.next());
                    depositosCp.add(deposito);
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                break;
            case 3:
                System.out.println("1 - Sacar");
                System.out.println("2 - Depositar");
                System.out.print("Qual operação você deseja realizar? ");
                N = Integer.parseInt(scanner.next());
                if (N == 1) {
                    System.out.print("Digite a quantia a ser sacada: ");
                    saque = Double.parseDouble(scanner.next());
                    saquesCs.add(saque);
                    System.out.println("R$" + saque + " sacados com sucesso.");
                    limite = limite + 1;
                    do {
                        System.out.println("Deseja sacar novamente?(s/n) ");
                        resposta = scanner.next();
                        if (resposta == "s") {
                            System.out.print("Digite a quantia a ser sacada: ");
                            saque = Double.parseDouble(scanner.next());
                            saquesCs.add(saque);
                            System.out.println("R$" + saque + " sacados com sucesso.");
                            limite = limite + 1;
                        }
                    } while (resposta != "n" || limite == 3);
                    if (limite == 3) {
                        System.out.println("Limite de saques atingido!");
                    }
                }
                if (N == 2) {
                    System.out.print("Digite a quantia a ser depositada: ");
                    deposito = Double.parseDouble(scanner.next());
                    depositosCs.add(deposito);
                    System.out.println("R$" + deposito + " depositados com sucesso.");
                }
                break;
            case 4:
                System.out.println("Saldo atual da Conta Corrente:");
                System.out.println("R$" + cc1.getSaldo() + depositosCc.get(0) + - (saquesCc.get(0) + saquesCc.get(1) + saquesCc.get(2)));
                break;
            case 5:
                System.out.println("Saldo atual da Conta Poupança:");
                System.out.println("R$" + cp1.getSaldo() + depositosCp.get(0) + - (saquesCp.get(0) + saquesCp.get(1) + saquesCp.get(2)));
                break;
            case 6:
                System.out.println("Saldo atual da Conta Salário:");
                System.out.println("R$" + cs1.getSaldo() + depositosCs.get(0) + - (saquesCs.get(0) + saquesCs.get(1) + saquesCs.get(2)));
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
