public class EstatisticasDecorator extends RelatorioDecorator {

    public EstatisticasDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return super.gerar() + adicionarEstatisticas();
    }

    private String adicionarEstatisticas() {
        return "\n+ [Estatísticas de Faturamento: R$ 4.580,75 | Pedido Médio: R$ 1.526,91]";
    }
}