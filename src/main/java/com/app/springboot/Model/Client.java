package com.app.springboot.Model;


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
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Embedded
    private Adresse adresse;


    @Column(name="mail")
    private String mail;

    @Column(name="numTel")
    private String numTel;

    @OneToMany(mappedBy="client")
    private List<CommandeClient> commandeclients;

}

