package com.crud.democrud.controllers;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/usuario/rolUsuario")
public class UsuarioRolController {
    @Autowired
    UsuarioRolService usuarioRolService;

    @GetMapping()
    public ArrayList<UsuarioRolModel> obtenerRolUsuario(){
        return usuarioRolService.obtenerRolUsuario();
    }

    @PostMapping()
    public UsuarioRolModel guardarRolUsuario(@RequestBody UsuarioRolModel rol){
        return this.usuarioRolService.guardarRolUsuario(rol);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UsuarioRolModel> buscarRolId(@PathVariable("id_rol") Long id_rol){
        return this.usuarioRolService.buscarRolId(id_rol);
    }

    @DeleteMapping(path = "{id_rol}")
    public String eliminarRolUsuario(@PathVariable("id_rol") Long id_rol){
        boolean ok = this.usuarioRolService.eliminarRolUsuario(id_rol);
        if (ok){
            return "Se eliminó el rol con id: " + id_rol;
        }else {
            return "No pudo eliminarse el rol con id: " + id_rol;
        }
    }

    @PutMapping(path = "/actualizarRol")
    public UsuarioRolModel actualizarRolUsuario(@RequestBody UsuarioRolModel rol){
        return this.usuarioRolService.actualizarRolUsuario(rol);
    }
}
