package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class ValidaCalculoImpostoRenda {

    private double valorResultadoEsperado = 56500;

    @Dado("que tenho os seguintes bens {double}")
    public void queTenhoOsSeguintesBensTabelaFipeTipoResidenciaValorResidenciaValorInvestimentoValorPoupanca(
            double tabelaFipe
    ) {
        Assert.assertEquals(tabelaFipe,valorResultadoEsperado,10);
    }

    @Quando("submeto os meus bens para cálculo do imposto")
    public void submeto_os_meus_bens_para_cálculo_do_imposto() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("passou");
    }

    @Entao("devo obter o valor de imposto equivalente a R$ <ResultadoEsperado>")
    public void devo_obter_o_valor_de_imposto_equivalente_a_R$_ResultadoEsperado() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("passou");
    }
}
