package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.RoleDTO;
import co.edu.iudigital.app.dtos.RoleDTORequest;

import java.util.List;

public interface IRoleService {


    List<RoleDTO> getAll();
    RoleDTO save(RoleDTORequest request);

    RoleDTO getById(Long id);

    void deleteById(Long id);

}
