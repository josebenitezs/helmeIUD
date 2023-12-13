package co.edu.iudigital.app.services.impl;

import co.edu.iudigital.app.dtos.RoleDTO;
import co.edu.iudigital.app.dtos.RoleDTORequest;
import co.edu.iudigital.app.models.Role;
import co.edu.iudigital.app.repositories.IRoleRepository;
import co.edu.iudigital.app.services.ifaces.IRoleService;
import co.edu.iudigital.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {



    @Autowired
    private IRoleRepository roleRepository;
    @Autowired
    private Mapper mapper; // mapper de utilidades

    @Override
    public List<RoleDTO> getAll() {
        List<Role> roles =
                (List<Role>) roleRepository.findAll();
        return mapper.toRolesDTO(roles);

    }



    @Override
    public RoleDTO save(RoleDTORequest roleDTO) {
        Role role = mapper.toRole(roleDTO);
       role = roleRepository.save(role);
        return mapper.toRoleDTO(role);
    }


    @Override
    public RoleDTO getById(Long id) {
        Optional<Role> roleOptional =
                roleRepository.findById(id);
        RoleDTO roleDTO = new RoleDTO();
        if(roleOptional.isPresent()) {
            roleDTO = mapper.toRoleDTO(
                    roleOptional.get()
            );
        }
        return roleDTO;
    }

    @Override
    public void deleteById(Long id) {
        roleRepository.deleteById(id);
    }


}
