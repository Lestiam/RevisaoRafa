package entities;

public class Ingresso {
    private String nomeDoJogo;
    private double valor;
    private Integer quantidade;

    public Ingresso() {
    }
    public Ingresso(String nomeDoJogo, Double valor, Integer quantidade) {
        this.nomeDoJogo = nomeDoJogo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNomeDoJogo() {
        return nomeDoJogo;
    }

    public void setNomeDoJogo(String nomeDoJogo) {
        this.nomeDoJogo = nomeDoJogo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
