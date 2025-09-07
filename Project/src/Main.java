public class Main {

    public static void main(String[] args) {

        Repositorio<Cliente> repositorioCliente = new SaveRepositorio<>();
        Repositorio<Produto> repositorioProduto = new SaveRepositorio<>();

        System.out.println("--- Ada Commerce ---");

        System.out.println("--- Cadastro de Clientes ---");

        Cliente cliente1 = new Cliente("Guilherme", "159357468-20", "guiparracho@hotmail.com");
        Cliente cliente2 = new Cliente("Ana", "123456789-00", "anatorres@gmail.com");

        repositorioCliente.salvar(cliente1);
        repositorioCliente.salvar(cliente2);

        System.out.println("--- Cadastro de Produtos ---");

        Produto produto1 = new Produto("Teclado", 250.00);
        Produto produto2 = new Produto("Placa de video", 1500.00);

        repositorioProduto.salvar(produto1);
        repositorioProduto.salvar(produto2);

        System.out.println("--- Listagem de Clientes ---");

        for (Cliente c : repositorioCliente.listar()) {
            System.out.println(c);
        }

        System.out.println("--- Listagem de Produtos ---");

        for (Produto p : repositorioProduto.listar()) {
            System.out.println(p);
        }

        System.out.println("--- Criação de Pedido ---");

        Pedido pedido = new Pedido(cliente1);
        System.out.println("Status do pedido: " + pedido.getStatus());

        ItemPedido item1 = new ItemPedido(produto1, 5, produto1.getPreco());
        ItemPedido item2 = new ItemPedido(produto2, 10, produto2.getPreco());

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        System.out.println("Total do pedido: R$ " + pedido.calcularTotal());

        System.out.println("* Processo do pedido");
        if (!pedido.getItens().isEmpty()) {
            pedido.setStatus(StatusPedido.Aguardando_Pagamento);
            System.out.println("Status do pedido: " + pedido.getStatus());
        } else {
            System.out.println("Não autorizado um pedido sem itens.");
        }

        System.out.println("* Processando pagamento...");
        if (pedido.getStatus() == StatusPedido.Aguardando_Pagamento) {
            pedido.setStatus(StatusPedido.Pago);
            System.out.println("Status do pedido: " + pedido.getStatus());
        } else {
            System.out.println("* Pagamento não autorizado.");
        }

        System.out.println("* Enviando pedido...");
        if (pedido.getStatus() == StatusPedido.Pago) {
            pedido.setStatus(StatusPedido.Enviado);
            System.out.println("Status do pedido: " + pedido.getStatus());
        } else {
            System.out.println("* Envio não autorizado.");
        }

        System.out.println("--- Fim do Programa ---");
        System.out.println("Obrigado por comprar na Ada Commerce!");
    }
}