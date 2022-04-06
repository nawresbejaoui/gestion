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
@Table(name="commandeClient")
public class CommandeClient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="dateCommande")
    private Date dateCommande;

    @Column(name="etat")
    private String Etat;

    @ManyToOne
    @JoinColumn(name="idclient")
    private Client client;


    @OneToMany(mappedBy="commandeClient")
    private List<LigneCommandeClient>lignecommandeclients;
}

