package com.mitocode.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mitocode.model.Camisa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class JugadorDTO {
    
    private Integer idJugador;

    private String Nombre;

    private String Posicion;

    private  Camisa camisa;
}
