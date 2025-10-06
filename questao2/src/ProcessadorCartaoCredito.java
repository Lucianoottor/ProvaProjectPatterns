public class ProcessadorCartaoCredito implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Processando R$ " + String.format("%.2f", valor) + " com Cartão de Crédito.");
    }
}