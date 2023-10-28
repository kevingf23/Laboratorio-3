package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Camisa;
import com.mitocode.repo.ICamisaRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CamisaService {
    
    @Autowired
    private ICamisaRepo repo;

    public Camisa createCamisa(Camisa camisa) {

        return repo.save(camisa);
    }

    public List<Camisa> getCamisa(){
        return (List<Camisa>) repo.findAll();
    }


    
    public void deleteClient(Integer id){
        repo.deleteById(id);
    }
}
