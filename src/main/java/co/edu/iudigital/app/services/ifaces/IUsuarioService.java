package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.models.Usuario;

import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDTO> listUsers();

    public Usuario listUser(Long id);

    public Usuario saveUser(Usuario usuario);

    public Usuario listByUsername(String username);

    public Usuario updateUser(Usuario usuario);
}
