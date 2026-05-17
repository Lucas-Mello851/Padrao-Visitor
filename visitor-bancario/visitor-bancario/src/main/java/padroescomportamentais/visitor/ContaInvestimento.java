package padroescomportamentais.visitor;

public class ContaInvestimento implements Conta {

    private int numero;
    private String titular;
    private double saldo;
    private String tipoInvestimento;
    private ContaInvestimento contaVinculada;

    public ContaInvestimento(int numero, String titular, double saldo, String tipoInvestimento) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoInvestimento = tipoInvestimento;
        this.contaVinculada = null;
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

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public ContaInvestimento getContaVinculada() {
        return contaVinculada;
    }

    public void setContaVinculada(ContaInvestimento contaVinculada) {
        this.contaVinculada = contaVinculada;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirContaInvestimento(this);
    }

}
