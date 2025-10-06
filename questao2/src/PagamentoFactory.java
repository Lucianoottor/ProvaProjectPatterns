public class PagamentoFactory {
    public ProcessadorPagamento criarProcessador(String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo de pagamento não pode ser vazio.");
        }

        switch (tipo.toUpperCase()) {
            case "CARTAO_CREDITO":
                return new ProcessadorCartaoCredito();
            case "BOLETO":
                return new ProcessadorBoleto();
            case "PIX":
                return new ProcessadorPix();
            default:
                throw new IllegalArgumentException("Tipo de pagamento desconhecido: " + tipo);
        }
    }
}