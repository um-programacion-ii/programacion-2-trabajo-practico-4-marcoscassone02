package servicio.interfaces;

import modelo.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario registrarUsuario(Usuario usuario);
    Usuario obtenerUsuario(Long id);
    List<Usuario> listarUsuarios();
    void eliminarUsuario(Long id);
}
