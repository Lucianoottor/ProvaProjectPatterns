import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeModelos {
    private final Map<String, DocumentoPrototype> modelos = new HashMap<>();

    public void adicionarModelo(String nome, DocumentoPrototype modelo) {
        this.modelos.put(nome, modelo);
    }

    public DocumentoPrototype obterClone(String nome) {
        DocumentoPrototype modelo = modelos.get(nome);
        if (modelo == null) {
            throw new IllegalArgumentException("Modelo '" + nome + "' não encontrado.");
        }
        return modelo.clonar();
    }
}