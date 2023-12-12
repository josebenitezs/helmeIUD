package co.edu.iudigital.app.services.ifaces;


import co.edu.iudigital.app.dtos.DelitoDTO;
import co.edu.iudigital.app.dtos.DelitoDTORequest;

import java.util.List;

public interface IDelitoService {

    List<DelitoDTO> getAll();
    DelitoDTO save(DelitoDTORequest request);

    DelitoDTO getById(Long id);
    void deleteById(Long id);

}
