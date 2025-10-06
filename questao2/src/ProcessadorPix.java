public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Gerando QR Code para pagamento PIX de R$ " + String.format("%.2f", valor) + ".");
    }
}