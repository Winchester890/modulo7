public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double juros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double juros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.juros = juros;
    }
    public double getSaldo() {
        return this.saldo + this.juros * this.saldo;
    }

}
