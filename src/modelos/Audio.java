package modelos;


public class Audio {

    private String nome;
    private int classificacao;
    private int tempoRestante; // em minutos
    private int anoLancamento;
    private int totalReproducao;
    private int totalAvaliacao;
    private int totalCurtidas;
    private double avaliacao;


    public int getClassificacao() {
        return classificacao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public String getAvaliacao() {
       double nota = avaliacao / totalAvaliacao;

       if (nota == 0 ) {
           return "Não tem nenhuma avaliação";
       } else if (nota < 1.5) {
           return "★ ✩ ✩ ✩ ✩";
       } else if (nota < 2.5) {
           return "★ ★ ✩ ✩ ✩";
       } else if (nota < 3.5) {
           return "★ ★ ★ ✩ ✩";
       } else if (nota < 4.5) {
           return "★ ★ ★ ★ ✩";
       } else {
           return "★ ★ ★ ★ ★";
       }
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao += avaliacao;
        totalAvaliacao ++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curtir() {
        this.totalCurtidas++;
    }

    public void removerCurtida() {
        this.totalCurtidas--;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public void reproduzir() {
        this.totalReproducao++;
    }



}
