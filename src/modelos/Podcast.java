package modelos;

import interfaces.Classificavel;
import interfaces.Informacoes;

public class Podcast extends Audio implements Classificavel, Informacoes {

    private String host;
    private String descricao;


    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void Texibir(){
        System.out.println("Nome: " + getNome());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Tempo de podcast: " + getTempoRestante() + " minutos");
    }

    @Override
    public int getClassificacao() {
        return getTotalReproducao();
    }

    @Override
    public void exibirInformacao() {
        System.out.println("Nome: " + getNome());
        System.out.println("Avaliação: " + getAvaliacao());
        System.out.println("Curtida: " + getTotalCurtidas());
        System.out.println("Reproduções: " + getTotalReproducao());
        System.out.println("Tempo de podcast: " + getTempoRestante() + " minutos");

    }

    @Override
    public void exibirTitulo() {
        System.out.println("""
            ᆞP o d c a s t sᆞ
        """);
    }
}
