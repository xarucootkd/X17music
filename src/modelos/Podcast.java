package modelos;

import interfaces.Classificavel;
import interfaces.Informacoes;

public class Podcast extends Audio implements Classificavel, Informacoes {

    private String host;
    private String descricao;


    public Podcast(String nome, String host, String descricao, int anoLancamento, int tempoDeAudio) {
        super(nome, anoLancamento, tempoDeAudio);
        this.host = host;
        this.descricao = descricao;
    }


    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }


    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 1000) {
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
        System.out.println("Host: " + getHost());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Duração: " + getTempoDeAudio() + " minutos");

    }

    @Override
    public void exibirTitulo() {
        System.out.println("""
            ᆞP o d c a s t sᆞ
        """);
    }

    @Override
    public String toString() {
        return "Olá";
    }
}
