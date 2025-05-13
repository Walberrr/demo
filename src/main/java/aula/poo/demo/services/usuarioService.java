package aula.poo.demo.services;

import org.springframework.stereotype.Service;

import aula.poo.demo.repositories.usuarioRepository;

@Service

public class usuarioService {
    
    private usuarioRepository usuarioRepository;

    public usuarioService(usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void insertUsuario(Usuario usuario)

}
