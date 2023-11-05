package com.example.catalogobrinquedos.service;
import com.example.catalogobrinquedos.model.Toy;
import com.example.catalogobrinquedos.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ToyService {
    @Autowired
    private ToyRepository toyRepository;

    public List<Toy> getAllToys(){
        return toyRepository.findAll();
    }
    public Toy getToyById(Long id){
        return toyRepository.findById(id).orElse(null);
    }

    public Toy saveToy(Toy toy){
        return toyRepository.save(toy);
    }

    public void deleteToy(Long id){
        toyRepository.deleteById(id);
    }
}
