package com.app.springboot.Model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.math.BigDecimal;

public class Stock {

    @Column(name="quantite")
    private BigDecimal quantite;

    @OneToMany
    @JoinColumn(name="idarticle")
    private Article article;
}
