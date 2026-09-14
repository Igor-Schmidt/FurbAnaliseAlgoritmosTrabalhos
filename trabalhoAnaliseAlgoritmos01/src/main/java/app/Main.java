/**
 * @author Igor Zafriel Schmidt, Caio Eduardo de Morais
 */

package app;

import br.furb.analise.algoritmos.*;

public class Main {
    static void main() throws Exception {
        CentralAcoes central = new CentralAcoes();

        // PERSIANAS =============================================================
//        PersianaNatLight persianaNatLight = new PersianaNatLight();
//        PersianaSolarius persianaSolarius = new PersianaSolarius();
//
//        Persiana persianaNatLightAdaptada = new AdaptadorPersianaNatLight(persianaNatLight);
//        Persiana persianaSolariusAdaptada = new AdaptadorPersianaSolarius(persianaSolarius);
//
//        central.fecharPersiana(persianaNatLightAdaptada);
        // Fim PERSIANAS =============================================================

        // LAMPADAS =================================================================
//        LampadaPhellipes lampadaPhellipes = new LampadaPhellipes();
//        LampadaShoyuMi lampadaShoyuMi = new LampadaShoyuMi();
//
//        Lampada lampadaPhellipesAdaptada = new AdaptadorLampadaPhellipes(lampadaPhellipes);
//        Lampada lampadaShoyuMiAdaptada = new AdaptadorLampadaShoyuMi(lampadaShoyuMi);
//
//        central.ligarLampada(lampadaPhellipesAdaptada);
//        central.desligarLampada(lampadaPhellipesAdaptada);
//
//        central.ligarLampada(lampadaShoyuMiAdaptada);
//        central.desligarLampada(lampadaShoyuMiAdaptada);
        // Fim LAMPADAS =============================================================


        // AR CONDICIONADO ================================================================
//        ArCondicionadoGellaKaza arCondicionadoGellaKaza = new ArCondicionadoGellaKaza();
//
//        ArCondicionado arCondicionadoGellaKazaAdaptado = new AdaptadorArCondicionadoGellaKaza(arCondicionadoGellaKaza);
//
//        central.ligarArcondicionado(arCondicionadoGellaKazaAdaptado);
//        central.desligarArcondicionado(arCondicionadoGellaKazaAdaptado);
//
//        central.ligarArcondicionado(arCondicionadoGellaKazaAdaptado);
//
//        central.aumentarTemperaturaArcondicionado(arCondicionadoGellaKazaAdaptado);
//        central.diminuirTemperaturaArcondicionado(arCondicionadoGellaKazaAdaptado);
//
//        central.definirTemperaturaArcondicionado(arCondicionadoGellaKazaAdaptado, 16);
//        central.diminuirTemperaturaArcondicionado(arCondicionadoGellaKazaAdaptado);
//        central.diminuirTemperaturaArcondicionado(arCondicionadoGellaKazaAdaptado);


        ArCondicionadoVentoBaumn arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();

        ArCondicionado arCondicionadoVentoBaumnAdaptado = new AdaptadorArCondicionadoVentoBaumn(arCondicionadoVentoBaumn);

        central.ligarArcondicionado(arCondicionadoVentoBaumnAdaptado);
        central.desligarArcondicionado(arCondicionadoVentoBaumnAdaptado);

        central.ligarArcondicionado(arCondicionadoVentoBaumnAdaptado);

        central.aumentarTemperaturaArcondicionado(arCondicionadoVentoBaumnAdaptado);
        central.diminuirTemperaturaArcondicionado(arCondicionadoVentoBaumnAdaptado);

        central.definirTemperaturaArcondicionado(arCondicionadoVentoBaumnAdaptado, 34);
        central.aumentarTemperaturaArcondicionado(arCondicionadoVentoBaumnAdaptado);
        central.aumentarTemperaturaArcondicionado(arCondicionadoVentoBaumnAdaptado);
        // Fim AR CONDICIONADO =============================================================
    }
}
