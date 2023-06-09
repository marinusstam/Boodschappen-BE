package com.example.BoodschappenBE.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Artikel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String naam;
    String omschrijving;
    String prio;

 // generate getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getPrio() {
        return prio;
    }
    public void setPrio(String prio) {
        this.prio = prio;
    }

    public String getOmschrijving() {
        return omschrijving;
    }
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
}


