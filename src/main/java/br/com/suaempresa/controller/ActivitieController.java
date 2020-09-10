package br.com.suaempresa.controller;

import br.com.suaempresa.model.Activitie;
import br.com.suaempresa.repository.ActivitieRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Sua empresa")
@CrossOrigin(origins = "*")
public class ActivitieController {

    @Autowired
    private ActivitieRepository activitieRepository;

    @GetMapping("/activitie")
    @ApiOperation(value = "Returns an Activitie list")
    public List<Activitie> getAllActivitie(){
        return activitieRepository.findAll();
    }

    @GetMapping("/activitie/{id}")
    @ApiOperation(value = "Returns an Activitie by id")
    public ResponseEntity getByIdActivitie(@PathVariable("id") Long id){
        if(activitieRepository.existsById(id))
            return ResponseEntity.ok(activitieRepository.findById(id));

        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/activitie")
    @ApiOperation(value = "Creates a new Activitie")
    public ResponseEntity postActivitie(@RequestBody Activitie activitie){
        activitieRepository.save(activitie);
        return ResponseEntity.ok(activitie);
    }
}
