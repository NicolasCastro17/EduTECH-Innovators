package com.evaparcial.n2.eva.Repository;

import com.evaparcial.n2.eva.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuarios extends JpaRepository<Usuario , Long> {



}

