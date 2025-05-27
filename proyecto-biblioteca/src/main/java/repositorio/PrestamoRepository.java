package repositorio;

import modelo.Prestamo;

import java.util.List;
import java.util.Optional;

public interface PrestamoRepository {
    Prestamo guardar(Prestamo prestamo);
    Optional<Prestamo> buscarPorId(Long id);
    List<Prestamo> listarTodos();
    void eliminar(Long id);
}
