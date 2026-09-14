package app;

import br.furb.analise.algoritmos.PersianaSolarius;

public class AdaptadorPersianaSolarius implements  Persiana{
    private final PersianaSolarius persiana;

    public AdaptadorPersianaSolarius(PersianaSolarius persiana) {
        this.persiana = persiana;
    }

    @Override
    public void abrir() {
        persiana.subirPersiana();
        IO.println("Persiana Solarius aberta!");

    }

    @Override
    public void fechar() {
        persiana.descerPersiana();
        IO.println("Perciana Solarius fechada!");
    }
}
