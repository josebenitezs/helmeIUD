package co.edu.iudigital.app.controllers;

import co.edu.iudigital.app.dtos.RoleDTO;
import co.edu.iudigital.app.dtos.RoleDTORequest;
import co.edu.iudigital.app.services.ifaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRoleService roleService;

    @GetMapping
    public ResponseEntity<List<RoleDTO>> index(){
        return ResponseEntity.ok()
                .body(roleService.getAll());
    }

    @PostMapping
    public ResponseEntity<RoleDTO> save(
            @Validated @RequestBody RoleDTORequest request
    ){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(roleService.save(request));
    }
}
