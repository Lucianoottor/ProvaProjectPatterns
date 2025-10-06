public class CalculadoraDeFrete {
    private iTransporte transporte;

    public void setEstrategia(iTransporte transporte) {
        this.transporte = transporte;
    }

    public double calcular(Carga carga) {
        if (this.transporte == null) {
            throw new IllegalStateException("A estratégia de transporte não foi definida.");
        }
        return this.transporte.calcularTarifa(carga);
    }
}