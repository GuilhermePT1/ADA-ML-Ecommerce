public record ItemPedido(Produto produto, int quantidade) {
    public double getTotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "- " + produto.getNome() + " (Qtd: " + quantidade + ", Total: R$ " + getTotal() + ")";
    }
}