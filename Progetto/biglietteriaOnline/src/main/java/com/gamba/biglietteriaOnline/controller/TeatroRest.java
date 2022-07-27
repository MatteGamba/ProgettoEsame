package com.gamba.biglietteriaOnline.controller;

import com.gamba.biglietteriaOnline.entities.Spettacolo;
import com.gamba.biglietteriaOnline.entities.Teatro;
import com.gamba.biglietteriaOnline.service.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teatro")
public class TeatroRest {

    private BiglietteriaService service;

    @Autowired
    public TeatroRest(BiglietteriaService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Teatro>> getAllTheater(){
        List<Teatro> teatros = service.getAllTeatri();
        return new ResponseEntity<List<Teatro>>(teatros, HttpStatus.OK);
    }

    @GetMapping("/{codTeatro}")
    public ResponseEntity<Teatro> getOneTheatre(@PathVariable("codTeatro") int codTeatro){
        Teatro teatro = service.findTeatroByCodTeatro(codTeatro);
        return new ResponseEntity<Teatro>(teatro, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Teatro> addTheater(@RequestBody Teatro teatro){
        Teatro newTeatro = service.addTeatro(teatro);
        return new ResponseEntity<Teatro>(newTeatro, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Teatro> updTheatre(@RequestBody Teatro teatro){
        Teatro updTeatro = service.updTeatro(teatro);
        return new ResponseEntity<Teatro>(updTeatro, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codTeatro}")
    public ResponseEntity<Teatro> deleteTheatre(@PathVariable int codTeatro){
        service.deleteTeatro(codTeatro);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
