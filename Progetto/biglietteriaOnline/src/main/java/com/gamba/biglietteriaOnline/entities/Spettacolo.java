package com.gamba.biglietteriaOnline.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "spettacoli")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Spettacolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codSpettacolo;
    private String titolo;
    private String autore;
    private String regista;
    private double prezzo;
    @ManyToOne
    @JoinColumn(name = "cod_teatro")
    private Teatro codTeatro;

}
