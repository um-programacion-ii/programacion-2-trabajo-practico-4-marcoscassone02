package servicio.impl;

import modelo.Prestamo;
import repositorio.PrestamoRepository;
import servicio.interfaces.PrestamoService;

import java.util.List;

public class PrestamoServiceImpl implements PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoServiceImpl(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    @Override
    public Prestamo registrarPrestamo(Prestamo prestamo) {
        return prestamoRepository.guardar(prestamo);
    }

    @Override
    public Prestamo obtenerPrestamo(Long id) {
        return prestamoRepository.buscarPorId(id).orElse(null);
    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return prestamoRepository.listarTodos();
    }

    @Override
    public void eliminarPrestamo(Long id) {
        prestamoRepository.eliminar(id);
    }
}
