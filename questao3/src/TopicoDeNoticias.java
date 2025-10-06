import java.util.ArrayList;
import java.util.List;

public class TopicoDeNoticias implements Topico {
    private final String nome;
    private final List<Leitor> leitores;
    private String ultimaNoticia;

    public TopicoDeNoticias(String nome) {
        this.nome = nome;
        this.leitores = new ArrayList<>();
    }

    public void publicarNovaNoticia(String tituloNoticia) {
        this.ultimaNoticia = tituloNoticia;
        System.out.println("\n--- Nova publicação no tópico '" + this.nome + "' ---");
        notificarLeitores();
    }

    @Override
    public void inscrever(Leitor leitor) {
        this.leitores.add(leitor);
    }

    @Override
    public void desinscrever(Leitor leitor) {
        this.leitores.remove(leitor);
    }

    @Override
    public void notificarLeitores() {
        for (Leitor leitor : this.leitores) {
            leitor.notificar(this.nome, this.ultimaNoticia);
        }
    }
}