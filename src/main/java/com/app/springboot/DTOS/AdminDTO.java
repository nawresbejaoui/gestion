package com.app.springboot.DTOS;
import com.app.springboot.Model.Admin;
import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class AdminDTO {
    private Integer id;
    public AdminDTO fromEntity(Admin admin){
        if(admin==null)
            return null;
        return AdminDTO.builder().isAdmin(admin.getisAdmin()).build();
    }
}
