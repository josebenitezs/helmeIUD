package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.UsuarioDTO;
import co.edu.iudigital.app.dtos.UsuarioDTORequest;

import java.util.List;

public interface IUsuarioService {



        List<UsuarioDTO> getAll();;

        UsuarioDTO consultarPorId(Long id);


        UsuarioDTO save(UsuarioDTORequest request);

        UsuarioDTO getById(Long id);
        void deleteById(Long id);


}

