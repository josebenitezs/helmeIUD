package co.edu.iudigital.app.dtos;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder // patrón
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    Long id;

    String username;

    String nombre;

    String apellido;

    Boolean redSocial;

    LocalDate fechaNacimiento;

    Boolean enabled;

    String image;

    List<String> roles;
}