package servicio.impl;

import modelo.Prestamo;
import repositorio.PrestamoRepository;
import servicio.interfaces.PrestamoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public PrestamoServiceImpl(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    @Override
    public Prestamo registrarPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo obtenerPrestamo(Long id) {
        return prestamoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Préstamo no encontrado con id: " + id));
    }

    @Override
    public List<Prestamo> listarPrestamos() {
        return prestamoRepository.findAll();
    }

    @Override
    public Prestamo actualizarPrestamo(Long id, Prestamo prestamo) {
        if (!prestamoRepository.existsById(id)) {
            return null;
        }
        prestamo.setId(id);
        return prestamoRepository.save(prestamo);
    }

    @Override
    public boolean eliminarPrestamo(Long id) {
        if (prestamoRepository.existsById(id)) {
            prestamoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
