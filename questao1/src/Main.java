//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();
        Carga carga = new Carga(500, 200, 15);

        calculadora.setEstrategia(new TransporteTerrestre());
        double tarifaTerrestre = calculadora.calcular(carga);
        System.out.println("Tarifa do Transporte Terrestre: R$ " + String.format("%.2f", tarifaTerrestre));

        calculadora.setEstrategia(new TransporteAereo());
        double tarifaAerea = calculadora.calcular(carga);
        System.out.println("Tarifa do Transporte Aéreo: R$ " + String.format("%.2f", tarifaAerea));

        calculadora.setEstrategia(new TransporteMaritimo());
        double tarifaMaritima = calculadora.calcular(carga);
        System.out.println("Tarifa do Transporte Marítimo: R$ " + String.format("%.2f", tarifaMaritima));
    }
}