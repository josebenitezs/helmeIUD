package co.edu.iudigital.app.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsuarioDTORequest implements Serializable {


    @NotNull(message = "username obligatorio")

    String username;


    @NotNull(message = "nombre obligatorio")

    String nombre;

    String apellido;

    @Size(min = 5, message = "Debe suministrar contraseña segura")
    String password;

    @JsonProperty("red_social")
    Boolean redSocial;

    @JsonProperty("fecha_nacimiento")
    LocalDate fechaNacimiento;

    Boolean enabled;

    String image;
}
