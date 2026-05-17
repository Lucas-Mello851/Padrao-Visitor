package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtratoVisitorTest {

    @Test
    void deveExibirContaCorrente() {
        ContaCorrente conta = new ContaCorrente(1001, "Carlos", 2500.0, 500.0);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals("ContaCorrente{numero=1001, titular='Carlos', saldo=2500.0, limiteChequeEspecial=500.0}", visitor.exibir(conta));
    }

    @Test
    void deveExibirContaPoupanca() {
        ContaPoupanca conta = new ContaPoupanca(2001, "Fernanda", 8000.0, 0.5);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals("ContaPoupanca{numero=2001, titular='Fernanda', saldo=8000.0, taxaRendimento=0.5}", visitor.exibir(conta));
    }

    @Test
    void deveExibirContaInvestimentoSemVinculo() {
        ContaInvestimento conta = new ContaInvestimento(3001, "Roberto", 15000.0, "CDB");

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals("ContaInvestimento{numero=3001, titular='Roberto', saldo=15000.0, tipoInvestimento='CDB'}", visitor.exibir(conta));
    }

    @Test
    void deveExibirContaInvestimentoComVinculo() {
        ContaInvestimento contaPrincipal = new ContaInvestimento(3001, "Roberto", 15000.0, "CDB");
        ContaInvestimento contaVinculada = new ContaInvestimento(3002, "Roberto", 5000.0, "LCI");
        contaPrincipal.setContaVinculada(contaVinculada);

        ExtratoVisitor visitor = new ExtratoVisitor();
        assertEquals("ContaInvestimento{numero=3001, titular='Roberto', saldo=15000.0, tipoInvestimento='CDB', contaVinculada=3002}", visitor.exibir(contaPrincipal));
    }

}
