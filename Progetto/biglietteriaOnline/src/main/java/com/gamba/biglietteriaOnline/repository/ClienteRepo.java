package com.gamba.biglietteriaOnline.repository;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer> {
    void deleteClienteByCodCliente(int codCliente);
    Cliente findClienteByCodCliente(int codCliente);
}
