public class Main {
    public static void main(String[] args) {
        TopicoDeNoticias politica = new TopicoDeNoticias("Política");
        TopicoDeNoticias esportes = new TopicoDeNoticias("Esportes");
        TopicoDeNoticias tecnologia = new TopicoDeNoticias("Tecnologia");

        Leitor leitor1 = new LeitorAssinante("Leandro Escobar");
        Leitor leitor2 = new LeitorAssinante("Gabriel");
        Leitor leitor3 = new LeitorAssinante("Oruam");

        politica.inscrever(leitor1);
        politica.inscrever(leitor3);

        esportes.inscrever(leitor2);

        tecnologia.inscrever(leitor1);
        tecnologia.inscrever(leitor2);
        tecnologia.inscrever(leitor3);

        politica.publicarNovaNoticia("Novas Medidas Econômicas Anunciadas");
        esportes.publicarNovaNoticia("Time Local Vence o Campeonato");
        tecnologia.publicarNovaNoticia("Lançamento do Novo Processador Quântico");

        System.out.println("\n--- Oruam cancela a assinatura de Política ---");
        politica.desinscrever(leitor3);

        politica.publicarNovaNoticia("Reforma Ministerial em Discussão");
    }
}