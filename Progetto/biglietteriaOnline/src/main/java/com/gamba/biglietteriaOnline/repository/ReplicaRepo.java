package com.gamba.biglietteriaOnline.repository;

import com.gamba.biglietteriaOnline.entities.Biglietto;
import com.gamba.biglietteriaOnline.entities.Cliente;
import com.gamba.biglietteriaOnline.entities.Replica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplicaRepo extends JpaRepository<Replica, Integer> {
    void deleteReplicaByCodReplica(int codReplica);
    Replica findReplicaByCodReplica(int codReplica);
}
