package modelos;

import interfaces.Informacoes;
import interfaces.Classificavel;

public class Musica extends Audio implements Classificavel, Informacoes {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        return getTotalCurtidas();
    }

    public void exibir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getAlbum());
        System.out.println("Gênero: " + getAlbum());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Tempo de música: " + getTempoRestante() + " minutos");
    }


    @Override
    public void exibirInformacao() {
        System.out.println("Nome: " + getNome());
        System.out.println("Album: " + getAlbum());
        System.out.println("Artista: " + getArtista());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Tempo de música: " + getTempoRestante() + " minutos");
    }

    @Override
    public void exibirTitulo() {
        System.out.println("""
            ᆞM u s i c a sᆞ
        """);
    }
}
