package com.app.springboot.Model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table (name="Stock")
public class Stock {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="quantite")
    private BigDecimal quantite;

    @OneToMany(mappedBy = "mystock")
    private List<Article> article;



}
