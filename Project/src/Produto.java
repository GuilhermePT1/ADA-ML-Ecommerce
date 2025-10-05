public record Produto (String nome, double preco) {
    @Override
    public String toString() {
        return "Produto: " + "nome= " + nome + ", preco R$: " + preco;
    }
}