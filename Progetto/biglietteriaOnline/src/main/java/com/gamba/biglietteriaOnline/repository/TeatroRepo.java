package com.gamba.biglietteriaOnline.repository;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Spettacolo;
import com.gamba.biglietteriaOnline.entities.Teatro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeatroRepo extends JpaRepository<Teatro, Integer> {
    void deleteTeatroByCodTeatro(int codTeatro);
    Teatro findTeatroByCodTeatro(int codTeatro);
}
