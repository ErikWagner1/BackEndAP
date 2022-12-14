package com.portfolio.ErikWagner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String instituto;
    private String titulo;
    private String periodo;
    
    public Educacion(){
}
    public Educacion(Long id, String instituto,String titulo, String periodo){
        this.id=id;
        this.instituto=instituto;
        this.titulo=titulo;
        this.periodo=periodo;
    }
 }