package co.edu.iudigital.app.services.ifaces;

import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.dtos.CasoDTORequest;

import java.util.List;

public interface ICasoService {

    List<CasoDTO> getAll(); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    CasoDTO save(CasoDTORequest request); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    CasoDTO getById(Long id); // TODO: AGREGAR LAS EXCEPCIONES PERSONALIZADAS

    void deleteById(Long id);



    CasoDTO consultarPorId(Long id);




}