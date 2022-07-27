package com.gamba.biglietteriaOnline.controller;

import com.gamba.biglietteriaOnline.entities.Cliente;
import com.gamba.biglietteriaOnline.entities.Replica;
import com.gamba.biglietteriaOnline.service.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/replica")
public class ReplicaRest {

    private BiglietteriaService service;

    @Autowired
    public ReplicaRest(BiglietteriaService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Replica>> getAllReplica(){
        List<Replica> replicas = service.getAllRepliche();
        return new ResponseEntity<List<Replica>>(replicas, HttpStatus.OK);
    }

    @GetMapping("/{codReplica}")
    public ResponseEntity<Replica> getOneReplica(@PathVariable("codReplica") int codReplica){
        Replica replica = service.findReplicaByCodReplica(codReplica);
        return new ResponseEntity<Replica>(replica, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Replica> addReplica(@RequestBody Replica replica){
        Replica newReplica = service.addReplica(replica);
        return new ResponseEntity<Replica>(newReplica, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Replica> updReplica(@RequestBody Replica replica){
        Replica updReplica = service.updReplica(replica);
        return new ResponseEntity<Replica>(updReplica, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codReplica}")
    public ResponseEntity<Replica> deleteReplica(@PathVariable int codReplica){
        service.deleteReplica(codReplica);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
