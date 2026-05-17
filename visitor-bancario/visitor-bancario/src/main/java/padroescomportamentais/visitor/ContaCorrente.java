package padroescomportamentais.visitor;

public class ContaCorrente implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private double limiteChequeEspecial;

    public ContaCorrente(int numero, String titular, double saldo, double limiteChequeEspecial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContaCorrente(this);
    }

}
