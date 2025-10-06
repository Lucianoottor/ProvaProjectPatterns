public class PropostaComercial extends Documento {
    private String nomeEmpresaCliente;

    public PropostaComercial() {
        this.cor = "Azul Corporativo";
        this.fonte = "Calibri";
        this.logo = "Logo Padrão da Empresa";
        this.nomeEmpresaCliente = "[Nome da Empresa Cliente]";
    }

    public void setNomeEmpresaCliente(String nome) {
        this.nomeEmpresaCliente = nome;
    }

    @Override
    public DocumentoPrototype clonar() {
        PropostaComercial novaProposta = new PropostaComercial();
        novaProposta.cor = this.cor;
        novaProposta.fonte = this.fonte;
        novaProposta.logo = this.logo;
        novaProposta.nomeEmpresaCliente = this.nomeEmpresaCliente;
        return novaProposta;
    }

    @Override
    public void exibir() {
        System.out.println("--- Proposta Comercial ---");
        System.out.println("Cliente: " + nomeEmpresaCliente);
        System.out.println("Cor: " + cor + " | Fonte: " + fonte + " | Logo: " + logo);
    }
}