package app;

import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class AdaptadorArCondicionadoVentoBaumn implements ArCondicionado {
    private final ArCondicionadoVentoBaumn arCondicionado;

    public AdaptadorArCondicionadoVentoBaumn(ArCondicionadoVentoBaumn arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void ligar() throws Exception {
        arCondicionado.ligar();
        IO.println("ArCondicionado VentoBaumn ligado!");
    }

    @Override
    public void desligar() throws Exception {
        arCondicionado.desligar();
        IO.println("ArCondicionado VentoBaumn desligado!");
    }

    @Override
    public void aumentarTemperatura() throws Exception {
        validaTemperaturaAtual();

        int temperaturaAtual = arCondicionado.getTemperatura();
        arCondicionado.definirTemperatura(temperaturaAtual + 1);
        temperaturaAtual = arCondicionado.getTemperatura();

        IO.println("Temperatura aumentada!");
        IO.println("Temperatura atual: " + temperaturaAtual);
    }

    @Override
    public void diminuirTemperatura() throws Exception {
        validaTemperaturaAtual();

        int temperaturaAtual = arCondicionado.getTemperatura();
        arCondicionado.definirTemperatura(temperaturaAtual - 1);
        temperaturaAtual = arCondicionado.getTemperatura();

        IO.println("Temperatura diminuida!");
        IO.println("Temperatura atual: " + temperaturaAtual);
    }

    @Override
    public void definirTemperatura(int novaTemperatura) throws Exception {
        arCondicionado.definirTemperatura(novaTemperatura);

        IO.println("Nova temperatura definido com sucesso em: " + novaTemperatura);
    }

    public void validaTemperaturaAtual() {
        int temperaturaAtual = arCondicionado.getTemperatura();

        if (temperaturaAtual == 35) throw new IllegalArgumentException("Maximo de temperatura atingido 35");
        if (temperaturaAtual == 15) throw new IllegalArgumentException("Minimo de temperatura atingido 15");
    }
}
