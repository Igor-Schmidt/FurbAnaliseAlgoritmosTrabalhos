package app;

public interface ArCondicionado {
//    Ar-condicionado ligar, desligar, função aumentar e diminuir temperatura que altera a temperatura de 1 em 1
//    ponto. Função definir temperatura permite que o usuário informe a temperatura que ele quer rapidamente.

    void ligar() throws Exception;
    void desligar() throws Exception;
    void aumentarTemperatura() throws Exception;
    void diminuirTemperatura() throws Exception;

    void definirTemperatura(int novaTemperatura) throws Exception;
}
