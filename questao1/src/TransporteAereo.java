public class TransporteAereo implements iTransporte {
    @Override
    public double calcularTarifa(Carga carga) {
        return carga.getPesoKg() * 12.50 + 100.0;
    }
}