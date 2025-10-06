public class ExportacaoPDFDecorator extends RelatorioDecorator {

    public ExportacaoPDFDecorator(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public String gerar() {
        return adicionarCabecalhoPDF() + super.gerar() + adicionarRodapePDF();
    }

    private String adicionarCabecalhoPDF() {
        return "--- CABEÇALHO DO DOCUMENTO PDF ---\n";
    }

    private String adicionarRodapePDF() {
        return "\n--- RODAPÉ DO DOCUMENTO PDF ---";
    }
}