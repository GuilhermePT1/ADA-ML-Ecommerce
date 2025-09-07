import java.util.List;

public interface Repositorio<T> {
    void salvar(T obj);
    List<T> listar();
    void atualizar(T obj);
}