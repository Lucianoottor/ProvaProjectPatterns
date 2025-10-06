public class Main {
    public static void main(String[] args) {
        GerenciadorDeModelos gerenciador = new GerenciadorDeModelos();

        gerenciador.adicionarModelo("CURRICULO_PADRAO", new Curriculo());
        gerenciador.adicionarModelo("PROPOSTA_COMERCIAL", new PropostaComercial());

        System.out.println("--- Criando documentos a partir dos modelos ---");

        Curriculo curriculoBerne = (Curriculo) gerenciador.obterClone("CURRICULO_PADRAO");
        curriculoBerne.setNomeCandidato("Kauan");
        curriculoBerne.setCor("Verde Musgo");
        curriculoBerne.setFonte("Roboto");

        Curriculo curriculoAna = (Curriculo) gerenciador.obterClone("CURRICULO_PADRAO");
        curriculoAna.setNomeCandidato("Escobar");

        PropostaComercial propostaClienteA = (PropostaComercial) gerenciador.obterClone("PROPOSTA_COMERCIAL");
        propostaClienteA.setNomeEmpresaCliente("Empresa A Tech");
        propostaClienteA.setLogo("Logo Cliente A");

        System.out.println("\nDocumentos Gerados:");
        curriculoBerne.exibir();
        curriculoAna.exibir();
        propostaClienteA.exibir();

        System.out.println("\n--- Verificando o modelo original de currículo (não foi alterado) ---");
        Curriculo original = new Curriculo();
        original.exibir();
    }
}