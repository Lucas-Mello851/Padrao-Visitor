package padroescomportamentais.visitor;

public class ExtratoVisitor implements Visitor {

    public String exibir(Conta conta) {
        return conta.aceitar(this);
    }

    @Override
    public String exibirContaCorrente(ContaCorrente conta) {
        return "ContaCorrente{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=" + conta.getSaldo() +
                ", limiteChequeEspecial=" + conta.getLimiteChequeEspecial() +
                '}';
    }

    @Override
    public String exibirContaPoupanca(ContaPoupanca conta) {
        return "ContaPoupanca{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=" + conta.getSaldo() +
                ", taxaRendimento=" + conta.getTaxaRendimento() +
                '}';
    }

    @Override
    public String exibirContaInvestimento(ContaInvestimento conta) {
        String resultado = "ContaInvestimento{" +
                "numero=" + conta.getNumero() +
                ", titular='" + conta.getTitular() + '\'' +
                ", saldo=" + conta.getSaldo() +
                ", tipoInvestimento='" + conta.getTipoInvestimento() + '\'';

        if (conta.getContaVinculada() != null) {
            resultado += ", contaVinculada=" + conta.getContaVinculada().getNumero();
        }

        resultado += '}';
        return resultado;
    }

}
