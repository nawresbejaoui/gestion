package com.app.springboot.Model;

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
@Table(name="ligneCommandeFournisseur")

public class LigneCommandeFour {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="article")
    private Article article;

    @Column(name="qte")
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name="commandeFournisseur")
    private CommandeFournisseur commandefournisseurs;
}
