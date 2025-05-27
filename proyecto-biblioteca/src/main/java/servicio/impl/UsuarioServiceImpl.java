package servicio.impl;

import modelo.Usuario;
import repositorio.UsuarioRepository;
import servicio.interfaces.UsuarioService;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.guardar(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return usuarioRepository.buscarPorId(id).orElse(null);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.listarTodos();
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioRepository.eliminar(id);
    }
}
