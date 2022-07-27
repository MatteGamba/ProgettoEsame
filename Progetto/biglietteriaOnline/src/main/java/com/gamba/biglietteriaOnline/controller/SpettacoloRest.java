package com.gamba.biglietteriaOnline.controller;

import com.gamba.biglietteriaOnline.entities.Replica;
import com.gamba.biglietteriaOnline.entities.Spettacolo;
import com.gamba.biglietteriaOnline.service.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/spettacolo")
public class SpettacoloRest {

    private BiglietteriaService service;

    @Autowired
    public SpettacoloRest(BiglietteriaService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Spettacolo>> getAllShow(){
        List<Spettacolo> spettacolos = service.getAllSpettacoli();
        return new ResponseEntity<List<Spettacolo>>(spettacolos, HttpStatus.OK);
    }

    @GetMapping("/{codSpettacolo}")
    public ResponseEntity<Spettacolo> getOneShow(@PathVariable("codSpettacolo") int codSpettacolo){
        Spettacolo spettacolo = service.findSpettacoloByCodSpettacolo(codSpettacolo);
        return new ResponseEntity<Spettacolo>(spettacolo, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Spettacolo> addSpettacolo(@RequestBody Spettacolo spettacolo){
        Spettacolo newSpettacolo = service.addSpettacolo(spettacolo);
        return new ResponseEntity<Spettacolo>(newSpettacolo, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Spettacolo> updSpettacolo(@RequestBody Spettacolo spettacolo){
        Spettacolo updSpettacolo = service.updSpettacolo(spettacolo);
        return new ResponseEntity<Spettacolo>(updSpettacolo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codSpettacolo}")
    public ResponseEntity<Spettacolo> deleteReplica(@PathVariable int codSpettacolo){
        service.deleteSpettacolo(codSpettacolo);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
