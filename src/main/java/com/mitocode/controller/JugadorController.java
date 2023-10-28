package com.mitocode.controller;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Jugador;
import com.mitocode.service.IJugadorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/jugador")
@RequiredArgsConstructor
public class JugadorController {

    @Autowired
    private IJugadorService repo;

    @GetMapping("/get")
    public List<Jugador> getJugador() {
        return (List<Jugador>) repo.getJugador();
    }

    @PostMapping("/create")
    public Jugador createJugador(@RequestBody Jugador jugador) {
        return repo.createJugador(jugador);
    }

    @PutMapping("/update/{id}")
    public String updateJugador(@PathVariable Integer id, @RequestBody Jugador updatedJugador) {
        Jugador updated = repo.updateJugador(id, updatedJugador);

        if (updated != null) {
            return "Jugador has been updated successfully";
        } else {
            return "not found"; 
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteJugador(@PathVariable Integer id) {
        repo.deleteJugador(id);
        return " has been deleted successfully.";
    }

}
