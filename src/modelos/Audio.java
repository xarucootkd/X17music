package modelos;


public class Audio {

    private String nome;
    private int tempoRestante; // em minutos
    private double avaliacao;
    private int totalReproducao;
    private int totalAvaliacao;
    private int totalCurtidas;




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
       int nota = (int) (avaliacao / totalAvaliacao) / 2;

       if (nota == 1 ) {
           return "★ ✩ ✩ ✩ ✩";
       } else if (nota == 2) {
           return "★ ★ ✩ ✩ ✩";
       } else if (nota == 3) {
           return "★ ★ ★ ✩ ✩";
       } else if (nota == 4) {
           return "★ ★ ★ ★ ✩";
       } else if (nota == 5) {
           return "★ ★ ★ ★ ★";
       } else {
           return "Não tem nenhuma avaliação";
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
