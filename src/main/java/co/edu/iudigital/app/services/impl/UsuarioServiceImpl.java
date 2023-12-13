package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.dtos.UsuarioDTORequest;
import co.edu.iudigital.app.models.Usuario;
import co.edu.iudigital.app.repositories.IUsuarioRepository;
import co.edu.iudigital.app.services.ifaces.IUsuarioService;
import co.edu.iudigital.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements IUsuarioService {





    @Autowired
    private IUsuarioRepository usuarioRepository;
    @Autowired
    private Mapper mapper; // mapper de utilidades

    @Override
    public List<UsuarioDTO> getAll() {
        List<Usuario> usuarios =
                usuarioRepository.findAll();
        return mapper.toUsuarosDTO(usuarios);

    }

    @Override
    public UsuarioDTO consultarPorId(Long id) {
        return null;
    }



    @Override
    public UsuarioDTO save(UsuarioDTORequest usuarioDTO) {
        Usuario usuario = mapper.toUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return mapper.toUsuarioDTO(usuario);
    }


    @Override
    public UsuarioDTO getById(Long id) {
        Optional<Usuario> usuarioOptional =
                usuarioRepository.findById(id);
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        if(usuarioOptional.isPresent()) {
            usuarioDTO = mapper.toUsuarioDTO(
                    usuarioOptional.get()
            );
        }
        return usuarioDTO;
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }




}
