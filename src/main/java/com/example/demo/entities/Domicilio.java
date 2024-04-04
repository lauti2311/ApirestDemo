package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "domicilio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Builder

public class Domicilio extends BaseEntity {

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
