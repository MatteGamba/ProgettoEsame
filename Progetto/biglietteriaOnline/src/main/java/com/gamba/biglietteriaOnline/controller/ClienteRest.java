package com.gamba.biglietteriaOnline.controller;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Cliente;
import com.gamba.biglietteriaOnline.service.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/cliente")
public class ClienteRest {

    private BiglietteriaService service;

    @Autowired
    public ClienteRest(BiglietteriaService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAllTickets(){
        List<Cliente> clientes = service.getAllClienti();
        return new ResponseEntity<List<Cliente>>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{codCliente}")
    public ResponseEntity<Cliente> getOneClient(@PathVariable("codCliente") int codCliente){
        Cliente cliente = service.findClienteByCodCliente(codCliente);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente){
        Cliente newCliente = service.addCliente(cliente);
        return new ResponseEntity<Cliente>(newCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> updClient(@RequestBody Cliente cliente){
        Cliente updCliente = service.updCliente(cliente);
        return new ResponseEntity<Cliente>(updCliente, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codCliente}")
    @Transactional
    public ResponseEntity<Cliente> deleteCliente(@PathVariable int codCliente){
        service.deleteCliente(codCliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
