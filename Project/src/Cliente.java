public record Cliente (String nome, String documento, String email) {
    @Override
    public String toString() {
        return "Cliente: " + nome + ", Documento: " + documento + ", Email: " + email;
    }
}