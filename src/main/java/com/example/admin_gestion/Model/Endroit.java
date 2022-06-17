package com.example.admin_gestion.Model;

import javax.persistence.*;

@Entity

public class Endroit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private String Ville;
    @Column
    private String description;

    private String nome_photo;

    public Endroit(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public Endroit() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNome_photo() {
        return nome_photo;
    }

    public void setNome_photo(String nome_photo) {
        this.nome_photo = nome_photo;
    }
}
