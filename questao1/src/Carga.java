public class Carga {
    private final double distanciaKm;
    private final double pesoKg;
    private final double volumeM3;

    public Carga(double distanciaKm, double pesoKg, double volumeM3) {
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
        this.volumeM3 = volumeM3;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public double getVolumeM3() {
        return volumeM3;
    }
}