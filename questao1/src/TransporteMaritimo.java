public class TransporteMaritimo implements iTransporte {
    @Override
    public double calcularTarifa(Carga carga) {
        return carga.getVolumeM3() * 95.0 + 350.0;
    }
}