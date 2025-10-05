import java.util.ArrayList;
import java.util.List;

public class SaveRepositorio<T> implements Repositorio<T> {
    private List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        lista.add(obj);
        if (obj instanceof Cliente) {
            System.out.println("Cliente salvo: " + obj);
        } else if (obj instanceof Produto) {
            System.out.println("Produto salvo: " + obj);
        } else {
            System.out.println("Objeto salvo: " + obj);
        }
    }

    @Override
    public List<T> listar() {
        return new ArrayList<>(lista);
    }

    @Override
    public void atualizar(T obj) {
        System.out.println("Atualização feita");
    }
}