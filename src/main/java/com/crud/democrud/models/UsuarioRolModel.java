package com.crud.democrud.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "rolUsuario")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_Rol;

    private String rol;

    //@ManyToMany(mappedBy = "rol-usuario")
    //private Set<UsuarioModel> usuario;

    public UsuarioRolModel() {
    }

    public UsuarioRolModel(String rol) {
        this.rol = rol;
    }

    public Long getId_Rol() {
        return id_Rol;
    }

    public void setId_Rol(Long id_Rol) {
        this.id_Rol = id_Rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
