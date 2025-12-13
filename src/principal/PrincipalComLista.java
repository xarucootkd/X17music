package principal;

import modelos.Audio;
import modelos.Musica;
import modelos.Podcast;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Esferas do Dragão", "Single", "7MZ", "Anime", 2021, 2);

        Musica musica2 = new Musica("Harlequin", "Single", "VMZ", "Anime", 2020, 2);

        Podcast podcast1 = new Podcast("LudoCast", "Ludoviajante", "Podcast sobre filosofia e ciência", 2025, 50);



        ArrayList<Audio> escutados = new ArrayList<>();

        escutados.add(musica1);
        escutados.add(musica2);
        escutados.add(podcast1);

        System.out.println(" E . S . C . U . T . A . D . O . S \n");
        for (Audio audio: escutados) {
            System.out.println("Nome: " + audio.getNome());

            if (audio instanceof Musica musica){
                System.out.println("Artista: " + musica.getArtista());
                System.out.println("Album: " + musica.getAlbum() + "\n");
            } else if ( audio instanceof Podcast podcast) {
                System.out.println("Host: " + podcast.getHost());
                System.out.println("Descrição: " + podcast.getDescricao() + "\n");
            }

        }


    }
}
