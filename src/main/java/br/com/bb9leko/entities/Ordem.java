package br.com.bb9leko.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordem")
public  class Ordem extends PanacheEntityBase {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id; 

        public String ticker;

        public int quantity;

        public double price;

}