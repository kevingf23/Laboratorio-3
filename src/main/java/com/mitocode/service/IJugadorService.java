package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Jugador;
import com.mitocode.repo.IJugadorRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class IJugadorService{
    
    @Autowired
    private IJugadorRepo jugadorRepo;

    public Jugador createJugador(Jugador jugador){
        return jugadorRepo.save(jugador);
    }

    public List<Jugador> getJugador(){
        return (List<Jugador>) jugadorRepo.findAll();
    }

  
    public Jugador updateJugador(Integer id, Jugador updated){
        Jugador existing = jugadorRepo.findById(id).orElse(null);
        
        if (existing != null) {
            existing.setNombre(updated.getNombre());
            existing.setPosicion(updated.getPosicion());
            existing.setCamisa(updated.getCamisa());

            return jugadorRepo.save(existing);
        } else {
            return null; 
        }
    }
    
    public void deleteJugador(Integer id){
        jugadorRepo.deleteById(id);
    }
}

