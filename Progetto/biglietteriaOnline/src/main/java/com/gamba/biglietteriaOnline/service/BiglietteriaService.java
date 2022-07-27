package com.gamba.biglietteriaOnline.service;

import com.gamba.biglietteriaOnline.entities.*;

import java.util.List;

public interface BiglietteriaService {

    List<Biglietto> getAllBiglietti();
    List<Cliente> getAllClienti();
    List<Replica> getAllRepliche();
    List<Spettacolo> getAllSpettacoli();
    List<Teatro> getAllTeatri();

    Biglietto addBiglietto(Biglietto biglietto);
    Cliente addCliente(Cliente cliente);
    Replica addReplica(Replica replica);
    Spettacolo addSpettacolo(Spettacolo spettacolo);
    Teatro addTeatro(Teatro teatro);

    Biglietto updBiglietto(Biglietto biglietto);
    Cliente updCliente(Cliente cliente);
    Replica updReplica(Replica replica);
    Spettacolo updSpettacolo(Spettacolo spettacolo);
    Teatro updTeatro(Teatro teatro);

    void deleteBiglietto(int codOperazione);
    void deleteCliente(int codCliente);
    void deleteReplica(int codReplica);
    void deleteSpettacolo(int codSpettacolo);
    void deleteTeatro(int codTeatro);

    Biglietto findBigliettoByCodOperazione(int codOperazione);
    Cliente findClienteByCodCliente(int codCliente);
    Replica findReplicaByCodReplica(int codReplica);
    Spettacolo findSpettacoloByCodSpettacolo(int codSpettacolo);
    Teatro findTeatroByCodTeatro(int codTeatro);

}
