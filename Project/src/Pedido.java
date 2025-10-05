import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private LocalDate dataPedido;
    private StatusPedido status;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.dataPedido = LocalDate.now();
        this.status = StatusPedido.Aberto;
    }

    public void adicionarItem(ItemPedido item) {
        if (this.status == StatusPedido.Aberto) {
            this.itens.add(item);
            System.out.println("Item adicionado: " + item.produto().nome());
    }   else
            System.out.println("Não é possível adicionar itens a um pedido sem estar aberto.");
    }

    public void removerItem(ItemPedido item) {
        if (this.status == StatusPedido.Aberto) {
            if (this.itens.remove(item)) {
                System.out.println("Item removido: " + item.produto().nome());
            } else {
                System.out.println("Item não encontrado no pedido.");
            }
        } else {
            System.out.println("Não é possível remover itens de um pedido sem estar aberto.");
        }
    }

    public double calcularTotal() {
        return itens.stream()
                .mapToDouble(ItemPedido::getTotal)
                .sum();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}