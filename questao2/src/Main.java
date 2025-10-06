//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PagamentoFactory fabrica = new PagamentoFactory();

        double valorDaCompra = 250.50;

        try {
            ProcessadorPagamento processadorPix = fabrica.criarProcessador("PIX");
            processadorPix.processar(valorDaCompra);

            ProcessadorPagamento processadorBoleto = fabrica.criarProcessador("BOLETO");
            processadorBoleto.processar(valorDaCompra);

            ProcessadorPagamento processadorCartao = fabrica.criarProcessador("CARTAO_CREDITO");
            processadorCartao.processar(valorDaCompra);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}