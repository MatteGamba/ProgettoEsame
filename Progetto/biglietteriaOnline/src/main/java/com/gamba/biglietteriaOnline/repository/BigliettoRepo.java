package com.gamba.biglietteriaOnline.repository;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BigliettoRepo extends JpaRepository<Biglietto, Integer> {
    void deleteBigliettoByCodOperazione(int codOperazione);
    Biglietto findBigliettoByCodOperazione(int codOperazione);
}
