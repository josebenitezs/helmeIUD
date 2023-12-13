package co.edu.iudigital.app.services.impl;


import co.edu.iudigital.app.dtos.CasoDTO;
import co.edu.iudigital.app.dtos.CasoDTORequest;
import co.edu.iudigital.app.models.Caso;
import co.edu.iudigital.app.repositories.ICasoRepository;
import co.edu.iudigital.app.services.ifaces.ICasoService;
import co.edu.iudigital.app.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CasoServiceImpl implements ICasoService {


    @Autowired
    private ICasoRepository casoRepository;
    @Autowired
    private Mapper mapper; // mapper de utilidades

    @Override
    public List<CasoDTO> getAll() {
        List<Caso> casos =
                casoRepository.findAll();
        return mapper.tocasosDTO(casos);

    }



    @Override
    public CasoDTO consultarPorId(Long id) {
        return null;
    }



    @Override
    public CasoDTO save(CasoDTORequest casoDTO) {
        Caso caso = mapper.toCaso(casoDTO);
        caso = casoRepository.save(caso);
        return mapper.toCasoDTO(caso);
    }


    @Override
    public CasoDTO getById(Long id) {
        Optional<Caso> casoOptional =
                casoRepository.findById(id);
        CasoDTO casoDTO = new CasoDTO();
        if(casoOptional.isPresent()) {
            casoDTO = mapper.toCasoDTO(
                    casoOptional.get()
            );
        }
        return casoDTO;
    }

    @Override
    public void deleteById(Long id) {
        casoRepository.deleteById(id);
    }
}
