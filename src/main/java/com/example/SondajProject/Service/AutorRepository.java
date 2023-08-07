package com.example.SondajProject.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.SondajProject.Model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}