package com.example.SondajProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Autor {

    @Id
    @GeneratedValue
    private long id;

    private String nume;
    private String prenume;

    @OneToOne(mappedBy = "autor", cascade = CascadeType.ALL)
    @JsonIgnore
    private Opinie opinie;

    public Autor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }
}


