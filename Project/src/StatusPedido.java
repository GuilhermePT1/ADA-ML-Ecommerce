public enum StatusPedido {
    Aberto ("Aberto"),
    Aguardando_Pagamento ("Aguardando Pagamento"),
    Pago ("Pago"),
    Enviado ("Enviado");

    private final String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}