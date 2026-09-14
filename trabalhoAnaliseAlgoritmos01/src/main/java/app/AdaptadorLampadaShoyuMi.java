package app;

import br.furb.analise.algoritmos.LampadaShoyuMi;

public class AdaptadorLampadaShoyuMi implements Lampada {
    private final LampadaShoyuMi lampada;

    public AdaptadorLampadaShoyuMi(LampadaShoyuMi lampada) {
        this.lampada = lampada;
    }

    @Override
    public void ligar() throws Exception {
        lampada.ligar();
        IO.println("Lampada ShoyuMi ligada!");
    }

    @Override
    public void desligar() throws Exception {
        lampada.desligar();
        IO.println("Lampada ShoyuMi desligada!");
    }
}
