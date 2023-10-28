package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Camisa;

public interface ICamisaRepo extends JpaRepository<Camisa, Integer>{
    
}
