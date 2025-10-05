import java.util.*;
import java.util.stream.Collectors;

public class Pedido {

    private String numero;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private CupomDeDesconto cupomDeDesconto;

    public Pedido(String numero, Cliente cliente, List<ItemPedido> itens) {
        this.numero = numero;
        this.cliente = cliente;
        this.itens = itens;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public void removerItem(Produto produto) {
        itens.removeIf(item -> item.produto().equals(produto));
    }

    public Map<Departamento, List<ItemPedido>> listarItensPorDepartamento() {
        return itens.stream()
                .collect(Collectors.groupingBy(item -> item.produto().getDepartamento()));
    }

    public double calcularValorTotalPorDepartamento(Departamento departamento) {
        return itens.stream()
                .filter(item -> item.produto().getDepartamento() == departamento)
                .mapToDouble(ItemPedido::getTotal)
                .sum();
    }

    public double calcularValorTotal() {
        double total = itens.stream().mapToDouble(ItemPedido::getTotal).sum();

        if (cupomDeDesconto != null && cupomDeDesconto.isValido()) {
            total -= total * (cupomDeDesconto.getPercentual() / 100);
        }

        return total;
    }

    public void aplicarCupomDesconto(CupomDeDesconto cupom) {
        this.cupomDeDesconto = cupom;
    }

    public Optional<CupomDeDesconto> getCupomDeDesconto() {
        return Optional.ofNullable(cupomDeDesconto);
    }
}