package com.app.springboot.DTOS;

import com.app.springboot.Model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;


@Data
@Builder
public class AdressDTO {

    private String adresse;

    private String ville;

    private String codePostal;

    private String pays;
    public AdressDTO fromEntity(Adresse adress)
    {
        if(adress == null)
            return null;
        return AdressDTO.builder().adresse(adress.getAdresse())
                .codePostal(adress.getCodePostal())
                .pays(adress.getPays())
                .ville(adress.getVille())
                .build();

    }
    public Adresse toEntity(AdressDTO adressDto){
        if(adressDto ==null)return null;
        Adresse adress=new Adresse();
        adress.setAdresse(adressDto.getAdresse());
        adress.setPays(adressDto.getPays());
        adress.setCodePostal(adressDto.getCodePostal());
        adress.setVille(adressDto.getVille());
        return adress;
    }

}
