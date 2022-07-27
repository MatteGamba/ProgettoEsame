package com.gamba.biglietteriaOnline.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "repliche")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Replica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codReplica;
    @ManyToOne
    @JoinColumn(name = "cod_spettacolo")
    private Spettacolo codSpettacolo;
    private LocalDate dataReplica;

}
