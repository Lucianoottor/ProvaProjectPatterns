public class Main {
    public static void main(String[] args) {
        System.out.println("--- GERANDO RELATÓRIO BÁSICO ---");
        Relatorio relatorioBase = new RelatorioBase();
        System.out.println(relatorioBase.gerar());
        System.out.println("========================================\n");

        System.out.println("--- GERANDO RELATÓRIO COM ESTATÍSTICAS ---");
        Relatorio relatorioComEstatisticas = new EstatisticasDecorator(new RelatorioBase());
        System.out.println(relatorioComEstatisticas.gerar());
        System.out.println("========================================\n");

        System.out.println("--- GERANDO RELATÓRIO COM ESTATÍSTICAS E GRÁFICOS ---");
        Relatorio relatorioComGraficos = new GraficosDecorator(new EstatisticasDecorator(new RelatorioBase()));
        System.out.println(relatorioComGraficos.gerar());
        System.out.println("========================================\n");

        System.out.println("--- GERANDO RELATÓRIO COMPLETO COM EXPORTAÇÃO PDF ---");
        Relatorio relatorioCompleto = new ExportacaoPDFDecorator(
                new GraficosDecorator(
                        new EstatisticasDecorator(
                                new RelatorioBase()
                        )
                )
        );
        System.out.println(relatorioCompleto.gerar());
        System.out.println("========================================\n");
    }
}