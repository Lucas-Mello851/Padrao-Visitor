package padroescomportamentais.visitor;

public interface Visitor {

    String exibirContaCorrente(ContaCorrente conta);
    String exibirContaPoupanca(ContaPoupanca conta);
    String exibirContaInvestimento(ContaInvestimento conta);

}
