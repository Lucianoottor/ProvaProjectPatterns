public class RelatorioBase implements Relatorio {
    @Override
    public String gerar() {
        return "Relatório Básico: [Lista de Pedidos: #123, #666, #999]";
    }
}