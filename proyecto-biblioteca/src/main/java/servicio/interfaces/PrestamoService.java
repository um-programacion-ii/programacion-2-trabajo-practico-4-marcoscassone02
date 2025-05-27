package servicio.interfaces;

import modelo.Prestamo;

import java.util.List;

public interface PrestamoService {
    Prestamo registrarPrestamo(Prestamo prestamo);
    Prestamo obtenerPrestamo(Long id);
    List<Prestamo> listarPrestamos();
    void eliminarPrestamo(Long id);
}
