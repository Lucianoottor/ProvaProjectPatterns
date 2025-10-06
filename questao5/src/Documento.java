public abstract class Documento implements DocumentoPrototype {
    protected String cor;
    protected String fonte;
    protected String logo;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setFonte(String fonte) {
        this.fonte = fonte;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}