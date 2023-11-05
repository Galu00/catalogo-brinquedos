package com.example.catalogobrinquedos.controller;

import com.example.catalogobrinquedos.model.Toy;
import com.example.catalogobrinquedos.service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toys")
public class ToyController {
    @Autowired
    private ToyService toyService;

    @GetMapping
    public List<Toy> getAllToys(){
        return toyService.getAllToys();
    }

    @GetMapping("/{id}")
    public Toy getToyById(@PathVariable Long id){
        return toyService.getToyById(id);
    }

    @PostMapping
    public Toy createToy(@RequestBody Toy toy){
        return toyService.saveToy(toy);
    }

    @PutMapping("/{id}")
    public Toy updateToy(@PathVariable Long id,@RequestBody Toy toy){
        toy.setId(id);
        return toyService.saveToy(toy);
    }

    @DeleteMapping("/{id}")
    public void deleteToy(@PathVariable Long id){
        toyService.deleteToy(id);
    }
}
