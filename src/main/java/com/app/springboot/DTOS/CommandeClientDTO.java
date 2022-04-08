package com.app.springboot.DTOS;
import com.app.springboot.Model.Client;
import com.app.springboot.Model.CommandeClient;
import com.app.springboot.Model.LigneCommandeClient;
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
public class CommandeClientDTO {
    private long id;


    private Date dateCommande;


    private String Etat;



    private ClientDTO client;



    private List<LigneCommandeClientDTO> lignecommandeclients;


    public CommandeClientDTO fromEntity(CommandeClient commandeclient)
    {
        if(commandeclient == null)
            return null;
        return  CommandeClientDTO.builder().id(commandeclient.getId())
                .dateCommande(commandeclient.getDateCommande())
                .Etat(commandeclient.getEtat())
                //.client(commandeclient.getClient())
                .build();

        //     .commandeclients(client.getCommandeclients()) to revisit


    }
    public Client toEntity(ClientDTO clientDTO){
        if(clientDTO ==null)return null;
        Client client=new Client();
        client.setNom(clientDTO.getNom());
        client.setAdresse(clientDTO.getAdresse());
        client.setMail(clientDTO.getMail());
        client.setNumTel(clientDTO.getNumTel());
        // need a list here figure it out
        return client;
    }
}
