package app;

public class CentralAcoes {
    // ACOES PERSIANAS =============================================================
    public void abrirPersiana(Persiana persiana) throws Exception {
        persiana.abrir();
    }
    public void fecharPersiana(Persiana persiana) throws Exception {
        persiana.fechar();
    }
    // FIM ACOES PERSIANAS =========================================================

    // ACOES LAMPADA =============================================================
    public void ligarLampada(Lampada lampada) throws Exception {
        lampada.ligar();
    }
    public void desligarLampada(Lampada lampada) throws Exception {
        lampada.desligar();
    }
    // FIM ACOES LAMPADA =========================================================

    // ACOES AR CONDICIONADO =============================================================
    public void ligarArcondicionado(ArCondicionado arCondicionado) throws Exception {
        arCondicionado.ligar();
    }
    public void desligarArcondicionado(ArCondicionado arCondicionado) throws Exception {
        arCondicionado.desligar();
    }
    public void aumentarTemperaturaArcondicionado(ArCondicionado arCondicionado) throws Exception {
        arCondicionado.aumentarTemperatura();
    }
    public void diminuirTemperaturaArcondicionado(ArCondicionado arCondicionado) throws Exception {
        arCondicionado.diminuirTemperatura();
    }
    public void definirTemperaturaArcondicionado(ArCondicionado arCondicionado, int novaTemperatura) throws Exception {
        arCondicionado.definirTemperatura(novaTemperatura);
    }
    // FIM ACOES AR CONDICIONADO =========================================================

//    Além das funcionalidades universais, você deve implementar “modo sono” neste modo, o Ar-condicionado e as luzes
//    são desligadas e a persiana fechada. E o “modo trabalho” as luzes e ar-condicionado devem ser ligadas, a temperatura
//    do ar deve ser 25 e as persianas devem ficar abertas.

    // MAIS ACOES =============================================================
    public void modoSono(Persiana persiana, Lampada lampada, ArCondicionado arCondicionado) throws Exception{
        persiana.fechar();
        lampada.desligar();
        arCondicionado.desligar();
        IO.println("Modo Sono, set finalizado!");
    }

    public void modoTrabalho(Persiana persiana, Lampada lampada, ArCondicionado arCondicionado) throws Exception{
        lampada.ligar();
        arCondicionado.ligar();
        arCondicionado.definirTemperatura(25);

        persiana.abrir();

        IO.println("Modo Trabalho, set finalizado!");
    }
    // FIM MAIS ACOES =========================================================
}
