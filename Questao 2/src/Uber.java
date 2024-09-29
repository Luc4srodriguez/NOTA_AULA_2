public class Uber {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;
    private double valor;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }


    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }

    public void calcularValorCorrida(){
        valor = (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida(){
        System.out.println("Distancia: " + distancia);
        System.out.println("Tempo Espera: " + tempoEspera);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Fator demanda: " + fatorDemanda);
        System.out.println("Valor final da corrida: " + valor);
    }
}
