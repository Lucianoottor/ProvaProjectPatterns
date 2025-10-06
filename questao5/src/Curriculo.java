public class Curriculo extends Documento {
    private String nomeCandidato;

    public Curriculo() {
        this.cor = "Cinza Padrão";
        this.fonte = "Arial";
        this.logo = "Logo Padrão da Empresa";
        this.nomeCandidato = "[Nome do Candidato]";
    }

    public void setNomeCandidato(String nome) {
        this.nomeCandidato = nome;
    }

    @Override
    public DocumentoPrototype clonar() {
        Curriculo novoCurriculo = new Curriculo();
        novoCurriculo.cor = this.cor;
        novoCurriculo.fonte = this.fonte;
        novoCurriculo.logo = this.logo;
        novoCurriculo.nomeCandidato = this.nomeCandidato;
        return novoCurriculo;
    }

    @Override
    public void exibir() {
        System.out.println("--- Currículo ---");
        System.out.println("Candidato: " + nomeCandidato);
        System.out.println("Cor: " + cor + " | Fonte: " + fonte + " | Logo: " + logo);
    }
}