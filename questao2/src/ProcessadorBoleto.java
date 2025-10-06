public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando boleto no valor de R$ " + String.format("%.2f", valor) + ".");
    }
}