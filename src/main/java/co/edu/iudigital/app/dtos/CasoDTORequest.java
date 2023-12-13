package co.edu.iudigital.app.dtos;

import co.edu.iudigital.app.models.Delito;
import co.edu.iudigital.app.models.Usuario;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class CasoDTORequest {




    LocalDateTime fechaHora;


    Float latitud;


    Float longitud;


    Float altitud;


    Boolean isVisible;


    String detalle;


    String urlMap;


    String rmiUrl;


    @JoinColumn(name = "delitos_id")
    Delito delito;


    @JoinColumn(name = "usuarios_id")
    Usuario usuario;
}
