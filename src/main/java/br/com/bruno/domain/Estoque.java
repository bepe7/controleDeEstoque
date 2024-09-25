package br.com.bruno.domain;

public class Estoque {
    private Produto produto;
    private Integer idEstoque;
    private double qntdMax;
    private double qntdAtual;
    private String conteudo;

    public Estoque(Integer idEstoque, Double qntdMax, String conteudo, Double qntdAtual) {
        this.idEstoque = idEstoque;
        this.conteudo = conteudo;
        this.qntdMax = qntdMax;
        this.qntdAtual = qntdAtual;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public double getqntdMax() {
        return qntdMax;
    }

    public void setqntdMax(double qntdMax) {
        this.qntdMax = qntdMax;
    }

    public double getQntdAtual() {
        return qntdAtual;
    }

    public void setQntdAtual(double qntdAtual) {
        this.qntdAtual = qntdAtual;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
