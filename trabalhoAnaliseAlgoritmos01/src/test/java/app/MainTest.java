package app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private CentralAcoes central;

    // Variáveis de controle para verificar se os métodos foram chamados e valores passados
    private boolean persianaAberta;
    private boolean persianaFechada;
    private boolean lampadaLigada;
    private boolean lampadaDesligada;
    private boolean arLigado;
    private boolean arDesligado;
    private int temperaturaAr;
    private boolean aumentouTemperatura;
    private boolean diminuiuTemperatura;

    // Implementações falsas para os testes
    private Persiana stubPersiana = new Persiana() {
        @Override
        public void abrir() { persianaAberta = true; }
        @Override
        public void fechar() { persianaFechada = true; }
    };

    private Lampada stubLampada = new Lampada() {
        @Override
        public void ligar() { lampadaLigada = true; }
        @Override
        public void desligar() { lampadaDesligada = true; }
    };

    private ArCondicionado stubArCondicionado = new ArCondicionado() {
        @Override
        public void ligar() { arLigado = true; }
        @Override
        public void desligar() { arDesligado = true; }
        @Override
        public void aumentarTemperatura() { aumentouTemperatura = true; }
        @Override
        public void diminuirTemperatura() { diminuiuTemperatura = true; }
        @Override
        public void definirTemperatura(int novaTemperatura) { temperaturaAr = novaTemperatura; }
    };

    @BeforeEach
    public void setUp() {
        central = new CentralAcoes();
        persianaAberta = false;
        persianaFechada = false;
        lampadaLigada = false;
        lampadaDesligada = false;
        arLigado = false;
        arDesligado = false;
        temperaturaAr = 0;
        aumentouTemperatura = false;
        diminuiuTemperatura = false;
    }

    /**
     * Teste para o "modo sono".
     * O esperado é que a persiana seja fechada, a lâmpada desligada e o ar-condicionado desligado.
     */
    @Test
    public void testModoSono() throws Exception {
        // Executa a ação
        central.modoSono(stubPersiana, stubLampada, stubArCondicionado);

        // Verifica os resultados esperados
        assertTrue(persianaFechada, "A persiana deveria ter sido fechada no modo sono");
        assertTrue(lampadaDesligada, "A lâmpada deveria ter sido desligada no modo sono");
        assertTrue(arDesligado, "O ar-condicionado deveria ter sido desligado no modo sono");
    }

    /**
     * Teste para o "modo trabalho".
     * O esperado é que a lâmpada seja ligada, ar ligado, temperatura definida para 25 e persiana aberta.
     */
    @Test
    public void testModoTrabalho() throws Exception {
        // Executa a ação
        central.modoTrabalho(stubPersiana, stubLampada, stubArCondicionado);

        // Verifica os resultados esperados
        assertTrue(lampadaLigada, "A lâmpada deveria ter sido ligada no modo trabalho");
        assertTrue(arLigado, "O ar-condicionado deveria ter sido ligado no modo trabalho");
        assertEquals(25, temperaturaAr, "A temperatura do ar-condicionado deveria estar em 25");
        assertTrue(persianaAberta, "A persiana deveria ter sido aberta no modo trabalho");
    }

    /**
     * Teste das ações individuais da Persiana.
     */
    @Test
    public void testAcoesPersiana() throws Exception {
        central.abrirPersiana(stubPersiana);
        assertTrue(persianaAberta, "A persiana deveria ser aberta");

        central.fecharPersiana(stubPersiana);
        assertTrue(persianaFechada, "A persiana deveria ser fechada");
    }

    /**
     * Teste das ações individuais da Lâmpada.
     */
    @Test
    public void testAcoesLampada() throws Exception {
        central.ligarLampada(stubLampada);
        assertTrue(lampadaLigada, "A lâmpada deveria ser ligada");

        central.desligarLampada(stubLampada);
        assertTrue(lampadaDesligada, "A lâmpada deveria ser desligada");
    }

    /**
     * Teste das ações individuais do Ar Condicionado.
     */
    @Test
    public void testAcoesArCondicionado() throws Exception {
        central.ligarArcondicionado(stubArCondicionado);
        assertTrue(arLigado, "O ar-condicionado deveria ser ligado");

        central.desligarArcondicionado(stubArCondicionado);
        assertTrue(arDesligado, "O ar-condicionado deveria ser desligado");

        central.aumentarTemperaturaArcondicionado(stubArCondicionado);
        assertTrue(aumentouTemperatura, "Deveria ter chamado aumentarTemperatura");

        central.diminuirTemperaturaArcondicionado(stubArCondicionado);
        assertTrue(diminuiuTemperatura, "Deveria ter chamado diminuirTemperatura");

        central.definirTemperaturaArcondicionado(stubArCondicionado, 22);
        assertEquals(22, temperaturaAr, "A temperatura deveria ter sido definida para 22");
    }
}