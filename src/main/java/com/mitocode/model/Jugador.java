package com.mitocode.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idJugador;

    private String Nombre;

    private String Posicion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "camisa_ent",
        joinColumns = 
        {@JoinColumn(name = "idJugador", referencedColumnName = "idJugador") },
        inverseJoinColumns = 
        {@JoinColumn(name = "idCamisa", referencedColumnName = "idCamisa")})
    private Camisa camisa;
    
}
