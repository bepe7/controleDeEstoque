package br.com.bruno.domain;

public class Produto {
    private Integer id;
    private String nomeDoProduto;
    private double preco;
    private double peso;
    private Fornecedor fornecedor;
    public Produto(Integer id, String nomeDoProduto, double preco, double peso, Fornecedor fornecedor) {
        this.id = id;
        this.nomeDoProduto = nomeDoProduto;
        this.preco = preco;
        this.peso = peso;
        this.fornecedor= fornecedor;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Fornecedor getFornecedor(){
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }
    public String toString() {
        return "Produto{" +
               "id=" + id +
               ", nomeDoProduto='" + nomeDoProduto + '\'' +
               ", preco=" + preco +
               ", peso=" + peso +
               '}';
    }
}
