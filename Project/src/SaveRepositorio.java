import java.util.ArrayList;
import java.util.List;

public class SaveRepositorio<T> implements Repositorio<T> {
    private List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        lista.add(obj);
        System.out.println("Cliente salvo: " + obj.toString());
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