package com.crud.democrud.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;


@Entity
@Table(name = "rolUsuario")
public class UsuarioRolModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id_Rol;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, targetEntity = UsuarioModel.class)
    @JoinColumn(name = "id_Rol_Usuario", nullable = false)
    @JsonBackReference
    private UsuarioModel usuario;

    private String rol;
    private Long id_Usuario;

    public UsuarioRolModel() {
    }

    public UsuarioRolModel(Long id_Rol, String rol, Long id_Usuario) {
        this.id_Rol = id_Rol;
        this.usuario = usuario;
        this.rol = rol;
        this.id_Usuario = id_Usuario;
    }

    public UsuarioRolModel(String rol) {
        this.rol = rol;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
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
