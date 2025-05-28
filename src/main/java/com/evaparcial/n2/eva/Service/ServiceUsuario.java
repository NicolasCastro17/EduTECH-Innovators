package com.evaparcial.n2.eva.Service;

import com.evaparcial.n2.eva.Model.Usuario;
import com.evaparcial.n2.eva.Repository.RepositoryUsuarios;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class ServiceUsuario {
    @Autowired
    private RepositoryUsuarios repositoryUsuarios;

    public List<Usuario> findAll(){
        return repositoryUsuarios.findAll();
    }

    public Usuario findAll(Long id){
        return repositoryUsuarios.findById(id).get();
    }

    public Usuario save(Usuario usuario){
        return repositoryUsuarios.save(usuario);
    }

    public void delete(Long id){
        repositoryUsuarios.deleteById(id);
    }



}
