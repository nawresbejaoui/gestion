package com.app.springboot.DTOS;
import com.app.springboot.Model.Fournisseur;
import com.app.springboot.Model.LigneCommandeFour;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;


@Data
@Builder
public class CommandeFournisseurDTO {
    private long id;


    private Date dateCommande;


    private String Etat;



    private FournisseurDTO fournisseur;



    private List<LigneCommandeFourDTO> lignecommandefournisseurs;
}
