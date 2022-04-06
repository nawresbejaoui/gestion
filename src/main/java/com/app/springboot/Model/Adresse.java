package com.app.springboot.Model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse {

    @Column(name="adresse")
    private String adresse;

    @Column(name="ville")
    private String ville;

    @Column(name="codePostal")
    private String codePostal;

    @Column(name="pays")
    private String pays;

}
