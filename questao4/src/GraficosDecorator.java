public class GraficosDecorator extends RelatorioDecorator {

    public GraficosDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return super.gerar() + adicionarGraficos();
    }

    private String adicionarGraficos() {
        return "\n+ [Gráfico de Vendas por Período: *Renderização Gráfica*]";
    }
}