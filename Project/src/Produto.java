public class Produto {

    private String codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidadeEstoque;
    private Departamento departamento;

    public Produto(String codigo, String nome, String descricao, double preco, int quantidadeEstoque, Departamento departamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.departamento = departamento;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public Departamento getDepartamento() { return departamento; }

    public void baixarEstoque(int quantidade) {
        if (quantidade > quantidadeEstoque)
            throw new IllegalArgumentException("Estoque insuficiente para o produto: " + nome);
        this.quantidadeEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produto)) return false;
        Produto other = (Produto) obj;
        return codigo.equals(other.codigo);
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }
}