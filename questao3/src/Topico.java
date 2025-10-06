import java.util.List;

public interface Topico {
    void inscrever(Leitor leitor);
    void desinscrever(Leitor leitor);
    void notificarLeitores();
}