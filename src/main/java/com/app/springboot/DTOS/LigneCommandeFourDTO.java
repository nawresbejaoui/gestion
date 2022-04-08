package com.app.springboot.DTOS;
import com.app.springboot.Model.Article;
import com.app.springboot.Model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Data
@Builder
public class LigneCommandeFourDTO {
    private long id;


    private ArticleDTO article;


    private Integer quantite;

    private CommandeFournisseurDTO commandefournisseurs;
}
