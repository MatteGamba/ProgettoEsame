package com.gamba.biglietteriaOnline.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teatri")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teatro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codTeatro;
    private String nome;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String telefono;
    private int posti;

}
