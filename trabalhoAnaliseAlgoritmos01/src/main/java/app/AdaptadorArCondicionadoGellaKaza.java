package app;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;

public class AdaptadorArCondicionadoGellaKaza implements ArCondicionado {
    private final ArCondicionadoGellaKaza arCondicionado;

    public AdaptadorArCondicionadoGellaKaza(ArCondicionadoGellaKaza arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void ligar() throws Exception {
        arCondicionado.ativar();
        IO.println("ArCondicionado GellaKaza ligado!");
    }

    @Override
    public void desligar() throws Exception {
        arCondicionado.desativar();
        IO.println("ArCondicionado GellaKaza desligado!");
    }

    @Override
    public void aumentarTemperatura() throws Exception {
        if (!arCondicionado.estaLigado())
            throw new IllegalArgumentException("Ar condicionado está desligado, ligue-o primeiro!");

        arCondicionado.aumentarTemperatura();
        int temperaturaAtual = arCondicionado.getTemperatura();
        IO.println("Temperatura aumentada!");
        IO.println("Temperatura atual: " + temperaturaAtual);
    }

    @Override
    public void diminuirTemperatura() throws Exception {
        if (!arCondicionado.estaLigado())
            throw new IllegalArgumentException("Ar condicionado está desligado, ligue-o primeiro!");

        arCondicionado.diminuirTemperatura();
        int temperaturaAtual = arCondicionado.getTemperatura();
        IO.println("Temperatura diminuida!");
        IO.println("Temperatura atual: " + temperaturaAtual);
    }

    @Override
    public void definirTemperatura(int novaTemperatura) throws Exception {
        // minimo 15
        // maximo 35

        int temperaturaAtual = arCondicionado.getTemperatura();

        if (!(temperaturaAtual == novaTemperatura)) {
            if (novaTemperatura < 15) throw new IllegalArgumentException("Minimo de temperatura é 15");
            else if (novaTemperatura > 35) throw new IllegalArgumentException("Maximo de temperatura é 35");

            // teste: 34 > 16
            if (novaTemperatura > temperaturaAtual) {
                while (novaTemperatura > temperaturaAtual) {
                    arCondicionado.aumentarTemperatura();
                    temperaturaAtual = arCondicionado.getTemperatura();
                }
            }

            // teste: 16 < 34
            else {
                while (novaTemperatura < temperaturaAtual) {
                    arCondicionado.diminuirTemperatura();
                    temperaturaAtual = arCondicionado.getTemperatura();
                }
            }

            if (novaTemperatura == temperaturaAtual) IO.println("Nova temperatura definido com sucesso em: " + temperaturaAtual);
        }
    }
}
