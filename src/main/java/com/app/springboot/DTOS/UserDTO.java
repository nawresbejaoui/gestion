package com.app.springboot.DTOS;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class UserDTO {
    private long id;
    private String nom;
    private String emailId;
    private String password;
}
