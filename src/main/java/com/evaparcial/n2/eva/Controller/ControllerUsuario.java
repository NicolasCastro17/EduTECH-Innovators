package com.evaparcial.n2.eva.Controller;

import com.evaparcial.n2.eva.Model.Usuario;
import com.evaparcial.n2.eva.Service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/usuario")

public class ControllerUsuario {
    @Autowired
    private ServiceUsuario serviceUsuario;

    @GetMapping
    public ResponseEntity<List<Usuario>> Listar(){
        
    }
    

}
