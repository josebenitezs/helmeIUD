package co.edu.iudigital.app.utils;

import co.edu.iudigital.app.dtos.*;
import co.edu.iudigital.app.models.Caso;
import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.models.Role;
import co.edu.iudigital.app.models.Usuario;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Mapper {

    public DelitoDTO toDelitoDTO(Delito delito){
        return DelitoDTO.builder()
                .id(delito.getId())
                .nombre(delito.getNombre())
                .descripcion(delito.getDescripcion())
                .build();
    }

    public Delito toDelito(DelitoDTO delitoDTO){
        Delito delito = new Delito();
        delito.setId(delitoDTO.getId());
        delito.setNombre(delitoDTO.getNombre());
        delito.setDescripcion(delitoDTO.getDescripcion());
        return delito;
    }

    public Delito toDelito(DelitoDTORequest delitoDTO){
        Delito delito = new Delito();
        delito.setNombre(delitoDTO.getNombre());
        delito.setDescripcion(delitoDTO.getDescripcion());
        return delito;
    }

    public List<DelitoDTO> toDelitosDTO(
            List<Delito> delitos
    ){
        return delitos.stream()
                .map(delito -> toDelitoDTO(delito))
                .collect(Collectors.toList());
    }

    public List<Delito> toDelitos(
            List<DelitoDTO> delitosDTO
    ){
        return delitosDTO.stream()
                .map(delitoDTO -> toDelito(delitoDTO))
                .collect(Collectors.toList());
    }


    public UsuarioDTO toUsuarioDTO(Usuario usuario){
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .username(usuario.getUsername())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .redSocial(usuario.getRedSocial())
                .fechaNacimiento(usuario.getFechaNacimiento())
                .enabled(usuario.getEnabled())
                .image(usuario.getImage())
                .build();


    }
    public Usuario toUsuario(UsuarioDTORequest usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setRedSocial(usuarioDTO.getRedSocial());
        usuario.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
        usuario.setEnabled(usuarioDTO.getEnabled());
        usuario.setImage(usuarioDTO.getImage());
        return usuario;
    }

    public Usuario toUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setRedSocial(usuarioDTO.getRedSocial());
        usuario.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
        usuario.setEnabled(usuarioDTO.getEnabled());
        usuario.setImage(usuarioDTO.getImage());
        return usuario;
    }



    public List<UsuarioDTO> toUsuarosDTO(
            List<Usuario> usuarios
    ){
        return usuarios.stream()
                .map(usuario -> toUsuarioDTO(usuario))
                .collect(Collectors.toList());
    }

    public List<Usuario> toUsuarios(
            List<UsuarioDTO> usuariosDTO
    ){
        return usuariosDTO.stream()
                .map(usuarioDTO -> toUsuario(usuarioDTO))
                .collect(Collectors.toList());
    }

    public CasoDTO toCasoDTO(Caso caso){
        return CasoDTO.builder()
                .id(caso.getId())
                .fechaHora(caso.getFechaHora())
                .latitud(caso.getLatitud())
                . longitud(caso.getLongitud())
                .altitud(caso.getLatitud())
                .isVisible(caso.getIsVisible())
                .detalle(caso.getDetalle())
                .urlMap(caso.getUrlMap())
                .rmiUrl(caso.getRmiUrl())
                .build();


    }
    public Caso toCaso(CasoDTORequest casoDTO){
        Caso caso = new Caso();
        caso.setFechaHora(casoDTO.getFechaHora());
        caso.setLatitud(casoDTO.getLatitud());
        caso.setLongitud(casoDTO.getLongitud());
        caso.setAltitud(casoDTO.getAltitud());
        caso.setIsVisible(casoDTO.getIsVisible());
        caso.setDetalle(casoDTO.getDetalle());
        caso.setUrlMap(casoDTO.getUrlMap());
        caso.setRmiUrl(casoDTO.getRmiUrl());

        return caso;
    }

    public Caso toCaso(CasoDTO casoDTO){
        Caso caso = new Caso();
        caso.setId(casoDTO.getId());
        caso.setFechaHora(casoDTO.getFechaHora());
        caso.setLatitud(casoDTO.getLatitud());
        caso.setLongitud(casoDTO.getLongitud());
        caso.setAltitud(casoDTO.getAltitud());
        caso.setIsVisible(casoDTO.getIsVisible());
        caso.setDetalle(casoDTO.getDetalle());
        caso.setUrlMap(casoDTO.getUrlMap());
        caso.setRmiUrl(casoDTO.getRmiUrl());

        return caso;

    }



    public List<CasoDTO> tocasosDTO(
            List<Caso> casos
    ){
        return casos.stream()
                .map(caso -> toCasoDTO(caso))
                .collect(Collectors.toList());
    }

    public List<Caso> tocasos(
            List<CasoDTO> casosDTO
    ){
        return casosDTO.stream()
                .map(casoDTO -> toCaso(casoDTO))
                .collect(Collectors.toList());
    }

    public RoleDTO toRoleDTO(Role role){
        return RoleDTO.builder()
                .id(role.getId())
                .nombre(role.getNombre())
                .descripcion(role.getDescripcion())
                .build();
    }

    public Role toRole(RoleDTO roleDTO){
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setNombre(roleDTO.getNombre());
        role.setDescripcion(roleDTO.getDescripcion());
        return role;
    }

    public Role toRole(RoleDTORequest roleDTO){
        Role role = new Role();
        role.setNombre(roleDTO.getNombre());
        role.setDescripcion(roleDTO.getDescripcion());
        return role;
    }

    public List<RoleDTO> toRolesDTO(
            List<Role> roles
    ){
        return roles.stream()
                .map(role-> toRoleDTO(role))
                .collect(Collectors.toList());
    }

    public List<Role> toRoles(
            List<RoleDTO> rolesDTO
    ){
        return rolesDTO.stream()
                .map(roleDTO -> toRole(roleDTO))
                .collect(Collectors.toList());
    }

}