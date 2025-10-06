public class LeitorAssinante implements Leitor {
    private final String nome;

    public LeitorAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificar(String nomeTopico, String tituloNoticia) {
        System.out.println("Notificação para " + this.nome + " | Novo artigo em [" + nomeTopico + "]: " + tituloNoticia);
    }
}