package repositorio;

import modelo.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroRepository {
    Libro guardar(Libro libro);
    Optional<Libro> buscarPorId(Long id);
    List<Libro> listarTodos();
    void eliminar(Long id);
}
