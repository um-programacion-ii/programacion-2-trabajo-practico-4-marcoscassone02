package servicio.interfaces;

import modelo.Libro;

import java.util.List;

public interface LibroService {
    Libro registrarLibro(Libro libro);
    Libro obtenerLibro(Long id);
    List<Libro> listarLibros();
    void eliminarLibro(Long id);
}
