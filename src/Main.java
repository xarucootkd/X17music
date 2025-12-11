import classes_extras.EmAlta;
import classes_extras.Exibir;
import classes_extras.MaisRecentes;
import modelos.Musica;
import modelos.Podcast;


public class Main {

    public static void limparTela(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        MaisRecentes filtroRecentes = new MaisRecentes();
        Exibir informacoes = new Exibir();
        EmAlta filtroEmAlta = new EmAlta();


        limparTela();



        Musica musica = new Musica("Esferas do Dragão", "Single", "7MZ", "Anime", 2021, 2);
        musica.setAvaliacao(9.0);
        musica.setAvaliacao(8);
        musica.setAvaliacao(10);

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
        filtroRecentes.maisRecentes(musica);
        informacoes.exibirInformacoes(musica);
        musica.getClassificacao();
        filtroEmAlta.emAlta(musica);


        limparTela();


        Podcast podcast = new Podcast("LudoCast", "Ludoviajante", "Podcast sobre filosofia e ciência", 2025, 50);
        podcast.setAvaliacao(3);
        podcast.setAvaliacao(3);
        podcast.setAvaliacao(3);


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
        filtroRecentes.maisRecentes(podcast);
        informacoes.exibirInformacoes(podcast);
        podcast.getClassificacao();
        filtroEmAlta.emAlta(podcast);




    }

}
