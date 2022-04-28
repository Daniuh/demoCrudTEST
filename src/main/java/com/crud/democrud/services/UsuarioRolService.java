package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioRolService {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    public ArrayList<UsuarioRolModel> obtenerRolUsuario(){
        return (ArrayList<UsuarioRolModel>) usuarioRolRepository.findAll();
    }

    public UsuarioRolModel guardarRolUsuario(UsuarioRolModel rol){
        return usuarioRolRepository.save(rol);
    }

    public Optional<UsuarioRolModel> buscarRolId(Long id_rol){
        return usuarioRolRepository.findById(id_rol);
    }

    public boolean eliminarRolUsuario(Long id_rol){
        try {
            usuarioRolRepository.deleteById(id_rol);
            return true;
        } catch (Exception err){
            return false;
        }
    }

    public UsuarioRolModel actualizarRolUsuario(UsuarioRolModel rol){
        return usuarioRolRepository.save(rol);
    }
}
