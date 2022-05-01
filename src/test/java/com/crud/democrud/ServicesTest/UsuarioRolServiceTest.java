package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UsuarioRolServiceTest {
    @Autowired
    UsuarioRolRepository usuarioRolRepository;

    @Test
    public void testGuardarRol(){
        UsuarioRolModel usuarioRolModel = new UsuarioRolModel(1L, "Doctor", 1L);
        UsuarioRolModel usuarioRolModelGuardado = usuarioRolRepository.save(usuarioRolModel);
        assertNotNull(usuarioRolModelGuardado);
    }
}
