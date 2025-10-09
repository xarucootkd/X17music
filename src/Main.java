import classes_extras.Exibir;
import classes_extras.Recomendacao;
import modelos.Musica;
import modelos.Podcast;


public class Main {

    public static void limparTela(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        Recomendacao filtro = new Recomendacao();
        Exibir informacoes = new Exibir();


        limparTela();



        Musica musica = new Musica();

        musica.setNome("Esferas do Dragão");
        musica.setAlbum("Single");
        musica.setArtista("7MZ");
        musica.setGenero("Anime");
        musica.setTempoRestante(2);
        musica.setAvaliacao(7.7);
        musica.setAvaliacao(9.0);
        musica.setAvaliacao(8.7);

        for (int i = 0; i < 113273; i++) {
            musica.curtir();
        }

        for (int i = 0; i < 321; i++) {
            musica.removerCurtida();
        }

        for (int i = 0; i < 1239103; i++) {
            musica.reproduzir();
        }

        informacoes.exibirTitulo(musica);
        informacoes.exibirInformacoes(musica);
        filtro.maisCurtidos(musica);


        limparTela();


        Podcast podcast = new Podcast();

        podcast.setNome("LudoCast");
        podcast.setHost("Ludoviajante");
        podcast.setDescricao("Podcast sobre filosofia e ciência");
        podcast.setTempoRestante(50);
        podcast.setAvaliacao(8.7);
        podcast.setAvaliacao(9.3);
        podcast.setAvaliacao(7.9);


        for (int i = 0; i < 21737; i++) {
            podcast.curtir();
        }

        for (int i = 0; i < 631; i++) {
            podcast.removerCurtida();
        }

        for (int i = 0; i < 183227; i++) {
            podcast.reproduzir();
        }

        informacoes.exibirTitulo(podcast);
        informacoes.exibirInformacoes(podcast);
        filtro.maisCurtidos(podcast);



    }

}
