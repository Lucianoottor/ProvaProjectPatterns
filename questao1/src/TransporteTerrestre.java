public class TransporteTerrestre implements iTransporte {
    @Override
    public double calcularTarifa(Carga carga) {
        return carga.getDistanciaKm() * 1.85;
    }
}