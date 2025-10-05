import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Repositorio<Cliente> repositorioCliente = new SaveRepositorio<>();
        Repositorio<Produto> repositorioProduto = new SaveRepositorio<>();

        System.out.println("--- Ada Commerce ---");

        // Cadastro de clientes
        Cliente cliente1 = new Cliente("Guilherme", "159357468-20", "guiparracho@hotmail.com");
        Cliente cliente2 = new Cliente("Ana", "123456789-00", "anatorres@gmail.com");

        repositorioCliente.salvar(cliente1);
        repositorioCliente.salvar(cliente2);

        // Cadastro de produtos
        Produto produto1 = new Produto("P001", "Teclado", "Teclado Mecânico RGB", 250.00, 100, Departamento.ELETRONICO);
        Produto produto2 = new Produto("P002", "Placa de vídeo", "RTX 4070 Super", 3500.00, 20, Departamento.ELETRONICO);
        Produto produto3 = new Produto("P003", "Livro Java Efetivo", "Guia prático de Java", 120.00, 50, Departamento.LIVROS);

        repositorioProduto.salvar(produto1);
        repositorioProduto.salvar(produto2);
        repositorioProduto.salvar(produto3);

        // Criando o pedido
        Pedido pedido = new Pedido("PED001", cliente1, new ArrayList<>());

        pedido.adicionarItem(produto1, 2);
        pedido.adicionarItem(produto2, 1);
        pedido.adicionarItem(produto3, 3);

        // Aplicar cupom
        CupomDeDesconto cupom = new CupomDeDesconto("Gui10", 10.0, LocalDateTime.now().plusDays(5));
        pedido.aplicarCupomDesconto(cupom);

        // Exibir por departamento
        Map<Departamento, List<ItemPedido>> itensPorDepartamento = pedido.listarItensPorDepartamento();
        itensPorDepartamento.forEach((departamento, itens) -> {
            System.out.println("\nDepartamento: " + departamento);
            itens.forEach(item -> System.out.println(item));
            System.out.println("Total do departamento: R$ " + pedido.calcularValorTotalPorDepartamento(departamento));
        });

        System.out.println("\nValor total do pedido (com desconto): R$ " + pedido.calcularValorTotal());

        // Cupom
        if (pedido.getCupomDeDesconto().isPresent()) {
            CupomDeDesconto c = pedido.getCupomDeDesconto().get();
            System.out.println("Cupom aplicado: " + c.getCodigo() +
                    " | Válido? " + (c.isValido() ? "Sim" : "Não"));
        }
    }
}
