public record ItemPedido (Produto produto, int quantidade, double precoVenda) {

    public double getTotal() {
        return precoVenda * quantidade;
    }

    @Override
    public String toString() {
        return "- " + produto().nome() + " (Quantidade: " + quantidade() + ", Preço de Venda: R$ " + precoVenda() + ")";
    }
}
