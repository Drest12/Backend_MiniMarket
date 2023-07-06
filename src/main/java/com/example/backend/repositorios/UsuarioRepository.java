package com.example.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.modelo.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}

