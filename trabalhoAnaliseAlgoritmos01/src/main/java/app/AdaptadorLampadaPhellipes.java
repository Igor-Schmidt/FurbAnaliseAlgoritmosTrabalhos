package app;

import br.furb.analise.algoritmos.LampadaPhellipes;

public class AdaptadorLampadaPhellipes implements Lampada{
    private final LampadaPhellipes lampada;

    public AdaptadorLampadaPhellipes(LampadaPhellipes lampada) {
        this.lampada = lampada;
    }

    @Override
    public void ligar() throws Exception {
        lampada.setIntensidade(100);
        IO.println("Lampada Phellipes ligada!");

    }

    @Override
    public void desligar() throws Exception {
        lampada.setIntensidade(0);
        IO.println("Lampada Phellipes desligada!");
    }
}
