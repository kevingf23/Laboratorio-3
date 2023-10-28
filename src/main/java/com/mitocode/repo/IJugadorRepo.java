package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Jugador;

@Repository
public interface IJugadorRepo extends JpaRepository<Jugador, Integer>{
    
}
