package padroescomportamentais.visitor;

public class Main {

    public static void main(String[] args) {

        ContaCorrente corrente = new ContaCorrente(1001, "Carlos", 2500.0, 500.0);
        ContaPoupanca poupanca = new ContaPoupanca(2001, "Fernanda", 8000.0, 0.5);
        ContaInvestimento investimento = new ContaInvestimento(3001, "Roberto", 15000.0, "CDB");
        ContaInvestimento vinculada = new ContaInvestimento(3002, "Roberto", 5000.0, "LCI");
        investimento.setContaVinculada(vinculada);

        ExtratoVisitor visitor = new ExtratoVisitor();

        System.out.println(visitor.exibir(corrente));
        System.out.println(visitor.exibir(poupanca));
        System.out.println(visitor.exibir(investimento));
        System.out.println(visitor.exibir(vinculada));

    }

}
