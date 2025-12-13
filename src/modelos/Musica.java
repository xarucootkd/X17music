package modelos;

import interfaces.Informacoes;
import interfaces.Classificavel;

public class Musica extends Audio implements Classificavel, Informacoes {

    private String album;
    private String artista;
    private String genero;


    public Musica (String nome, String album, String artista ,String genero, int anoLancamento, int tempoDeAudio){
        super(nome, anoLancamento, tempoDeAudio);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }


    @Override
    public int getClassificacao() {
        if (getTotalReproducao() > 10000) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public int getRecentes() {
        return getAnoLancamento();
    }


    @Override
    public void exibirInformacao() {
        System.out.println("Nome: " + getNome());
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Duração: " + getTempoDeAudio() + " minutos");
    }

    @Override
    public void exibirTitulo() {
        System.out.println("""
            ᆞM u s i c a sᆞ
        """);
    }

    @Override
    public String toString() {
        return "{" +
                "'nome:' " + "'" + getNome() +"'" + "," +
                "'album:' " + "'" + getAlbum() + "'" + "," +
                "'artista:' " + "'" + getArtista() + "'" + ',' +
                "'genero:' " + "'" + getGenero() + "'" + "," +
                "'avaliacao:' " + "'" + getAvaliacao() + "'" + "," +
                "'lancamento:' " + "'" + getAnoLancamento() + "'" + "," +
                "'curtidas:' " + "'" + getTotalCurtidas() + "'" + "," +
                "'reproducao:' " + "'" + getTotalReproducao() + "'" + "," +
                "'duracao:' " + "'" + getTempoDeAudio() + "'" + "," +
                "}";
    }
}
