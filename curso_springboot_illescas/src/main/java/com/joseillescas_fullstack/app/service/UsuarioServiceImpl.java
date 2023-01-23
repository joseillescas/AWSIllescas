package com.joseillescas_fullstack.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.CrudRepository;

import com.joseillescas_fullstack.app.entity.Usuario;
import com.joseillescas_fullstack.app.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;
    @Override
    public CrudRepository<Usuario, Long> getDao() {
        return usuarioRepository;
    }
	
	

}
