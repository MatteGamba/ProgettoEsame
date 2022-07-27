package com.gamba.biglietteriaOnline.service;

import com.gamba.biglietteriaOnline.entities.*;
import com.gamba.biglietteriaOnline.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiglietteriaServiceImpl implements BiglietteriaService{

    private BigliettoRepo bigliettoRepo;
    private ClienteRepo clienteRepo;
    private ReplicaRepo replicaRepo;
    private SpettacoloRepo spettacoloRepo;
    private TeatroRepo teatroRepo;

    @Autowired
    public BiglietteriaServiceImpl(BigliettoRepo bigliettoRepo, ClienteRepo clienteRepo, ReplicaRepo replicaRepo, SpettacoloRepo spettacoloRepo, TeatroRepo teatroRepo) {
        this.bigliettoRepo = bigliettoRepo;
        this.clienteRepo = clienteRepo;
        this.replicaRepo = replicaRepo;
        this.spettacoloRepo = spettacoloRepo;
        this.teatroRepo = teatroRepo;
    }

    @Override
    public List<Biglietto> getAllBiglietti() {
        return bigliettoRepo.findAll();
    }

    @Override
    public List<Cliente> getAllClienti() {
        return clienteRepo.findAll();
    }

    @Override
    public List<Replica> getAllRepliche() {
        return replicaRepo.findAll();
    }

    @Override
    public List<Spettacolo> getAllSpettacoli() {
        return spettacoloRepo.findAll();
    }

    @Override
    public List<Teatro> getAllTeatri() {
        return teatroRepo.findAll();
    }

    @Override
    public Biglietto addBiglietto(Biglietto biglietto) {
        return bigliettoRepo.save(biglietto);
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Replica addReplica(Replica replica) {
        return replicaRepo.save(replica);
    }

    @Override
    public Spettacolo addSpettacolo(Spettacolo spettacolo) {
        return spettacoloRepo.save(spettacolo);
    }

    @Override
    public Teatro addTeatro(Teatro teatro) {
        return teatroRepo.save(teatro);
    }

    @Override
    public Biglietto updBiglietto(Biglietto biglietto) {
        return bigliettoRepo.save(biglietto);
    }

    @Override
    public Cliente updCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Replica updReplica(Replica replica) {
        return replicaRepo.save(replica);
    }

    @Override
    public Spettacolo updSpettacolo(Spettacolo spettacolo) {
        return spettacoloRepo.save(spettacolo);
    }

    @Override
    public Teatro updTeatro(Teatro teatro) {
        return teatroRepo.save(teatro);
    }

    @Override
    public void deleteBiglietto(int codOperazione) {
        bigliettoRepo.deleteBigliettoByCodOperazione(codOperazione);
    }

    @Override
    public void deleteCliente(int codCliente) {
        clienteRepo.deleteClienteByCodCliente(codCliente);
    }

    @Override
    public void deleteReplica(int codReplica) {
        replicaRepo.deleteReplicaByCodReplica(codReplica);
    }

    @Override
    public void deleteSpettacolo(int codSpettacolo) {
        spettacoloRepo.deleteSpettacoloByCodSpettacolo(codSpettacolo);
    }

    @Override
    public void deleteTeatro(int codTeatro) {
        teatroRepo.deleteTeatroByCodTeatro(codTeatro);
    }

    @Override
    public Biglietto findBigliettoByCodOperazione(int codOperazione) {
        return bigliettoRepo.findBigliettoByCodOperazione(codOperazione);
    }

    @Override
    public Cliente findClienteByCodCliente(int codCliente) {
        return clienteRepo.findClienteByCodCliente(codCliente);
    }

    @Override
    public Replica findReplicaByCodReplica(int codReplica) {
        return replicaRepo.findReplicaByCodReplica(codReplica);
    }

    @Override
    public Spettacolo findSpettacoloByCodSpettacolo(int codSpettacolo) {
        return spettacoloRepo.findSpettacoloByCodSpettacolo(codSpettacolo);
    }

    @Override
    public Teatro findTeatroByCodTeatro(int codTeatro) {
        return teatroRepo.findTeatroByCodTeatro(codTeatro);
    }
}
