package servicio.impl;

import modelo.Libro;
import repositorio.LibroRepository;
import servicio.interfaces.LibroService;

import java.util.List;

public class LibroServiceImpl implements LibroService {

    private final LibroRepository libroRepository;

    public LibroServiceImpl(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    @Override
    public Libro registrarLibro(Libro libro) {
        return libroRepository.guardar(libro);
    }

    @Override
    public Libro obtenerLibro(Long id) {
        return libroRepository.buscarPorId(id).orElse(null);
    }

    @Override
    public List<Libro> listarLibros() {
        return libroRepository.listarTodos();
    }

    @Override
    public void eliminarLibro(Long id) {
        libroRepository.eliminar(id);
    }
}
