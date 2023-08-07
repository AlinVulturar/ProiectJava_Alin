package com.example.SondajProject.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.SondajProject.Model.Opinie;

import java.util.List;

@Repository
public interface OpinieRepository extends JpaRepository<Opinie, Long> {


    @Query(value = "select * from opinie", nativeQuery = true)
    List<Opinie> findAll();

    @Query(value = "select * from opinie where id = :opinieId", nativeQuery = true)
    Opinie findOpinieById(@Param("opinieId") long id);
}