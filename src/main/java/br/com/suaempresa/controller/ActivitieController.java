package br.com.suaempresa.controller;

import br.com.suaempresa.model.Activitie;
import br.com.suaempresa.repository.ActivitieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ActivitieController {

    @Autowired
    private ActivitieRepository activitieRepository;

    @GetMapping("/activitie")
    public List<Activitie> getAllActivitie(){
        return activitieRepository.findAll();
    }

    @GetMapping("/activitie/{id}")
    public ResponseEntity getByIdActivitie(@PathVariable("id") Long id){
        if(activitieRepository.existsById(id))
            return ResponseEntity.ok(activitieRepository.findById(id));

        return ResponseEntity.badRequest().build();
    }

    @PostMapping
    public ResponseEntity postActivitie(@RequestBody Activitie activitie){
        activitieRepository.save(activitie);
        return ResponseEntity.ok(activitie);
    }
}
