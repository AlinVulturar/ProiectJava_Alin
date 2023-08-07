package com.example.SondajProject.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Opinie {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String continutOpinie;

    @OneToOne(cascade = CascadeType.ALL)
    private Autor autor;

    public Opinie(String continutOpinie, Autor autor) {
        this.continutOpinie = continutOpinie;
        this.autor = autor;
    }
    public Opinie(String continutOpinie) {
        this.continutOpinie = continutOpinie;
        this.autor = autor;
    }
}