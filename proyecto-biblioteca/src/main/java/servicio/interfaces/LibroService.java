package servicio.interfaces;

public interface LibroService {
    Libro buscarPorIsbn(String isbn);
    List<Libro> obtenerTodos();
    Libro guardar(Libro libro);
    void eliminar(Long id);
    Libro actualizar(Long id, Libro libro);
}
