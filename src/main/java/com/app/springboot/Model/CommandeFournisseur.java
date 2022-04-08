package com.app.springboot.Model;


import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="commandeFournisseur")

public class CommandeFournisseur {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name=" dateCommande")
    private Date dateCommande;

    @Column(name="etat")
    private String Etat;

    @ManyToOne
    @JoinColumn(name="idFournisseur")
    private Fournisseur fournisseur;


    @OneToMany(mappedBy="commandefournisseurs")
    private List<LigneCommandeFour>lignecommandefournisseurs;
}


