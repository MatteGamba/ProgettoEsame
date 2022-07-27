package com.gamba.biglietteriaOnline.repository;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Replica;
import com.gamba.biglietteriaOnline.entities.Spettacolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpettacoloRepo extends JpaRepository<Spettacolo, Integer> {
    void deleteSpettacoloByCodSpettacolo(int codSpettacolo);
    Spettacolo findSpettacoloByCodSpettacolo(int codSpettacolo);
}
