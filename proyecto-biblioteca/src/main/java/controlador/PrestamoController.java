package controlador;

import modelo.Prestamo;
import servicio.interfaces.PrestamoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @GetMapping
    public ResponseEntity<List<Prestamo>> obtenerTodos() {
        return ResponseEntity.ok(prestamoService.listarPrestamos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> obtenerPorId(@PathVariable Long id) {
        try {
            Prestamo p = prestamoService.obtenerPrestamo(id);
            return ResponseEntity.ok(p);
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Prestamo> crear(@RequestBody Prestamo prestamo) {
        return ResponseEntity.ok(prestamoService.registrarPrestamo(prestamo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizar(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        Prestamo actualizado = prestamoService.actualizarPrestamo(id, prestamo);
        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        boolean eliminado = prestamoService.eliminarPrestamo(id);
        return eliminado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
