package com.gamba.biglietteriaOnline.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "biglietti")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codOperazione;
    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente codCliente;
    @ManyToOne
    @JoinColumn(name = "cod_replica")
    private Replica codReplica;
    private LocalDate dataOra;
    private String tipoPagamento;
    private int quantita;

    public Biglietto(Cliente codCliente, Replica codReplica, LocalDate dataOra, String tipoPagamento, int quantita) {
        super();
        this.codCliente = codCliente;
        this.codReplica = codReplica;
        this.dataOra = dataOra;
        this.tipoPagamento = tipoPagamento;
        this.quantita = quantita;
    }
}
