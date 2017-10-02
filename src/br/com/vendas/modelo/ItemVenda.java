package br.com.vendas.modelo;

public class ItemVenda {

    private Produto produto;
    private double quantidade;

    public ItemVenda() {

    }

    public ItemVenda(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

}
