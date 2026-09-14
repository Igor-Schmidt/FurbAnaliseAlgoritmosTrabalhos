package app;

import br.furb.analise.algoritmos.PersianaNatLight;

public class AdaptadorPersianaNatLight implements Persiana{
    private final PersianaNatLight persiana;

    public AdaptadorPersianaNatLight(PersianaNatLight persiana) {
        this.persiana = persiana;
    }

    @Override
    public void abrir() throws Exception {
        persiana.abrirPalheta();
        IO.println("Palhetas abertas");

        persiana.subirPalheta();
        IO.println("Persiana NatLight aberta");
    }

    @Override
    public void fechar() throws Exception {
        persiana.descerPalheta();
        IO.println("Perciana fechada");

        persiana.fecharPalheta();
        IO.println("Palhetas NatLight fechadas!");
    }
}
