package com.example.SondajProject.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.SondajProject.Model.Opinie;
import com.example.SondajProject.Service.OpinieService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/opinii")
public class OpinieRestController {

    private final OpinieService opinieService;

    @GetMapping
    public List<Opinie> getAll() {
        return opinieService.getAll();
    }

    @GetMapping("/getOpinieById")
    public Opinie getOpinieById(@RequestParam long id) {
        return opinieService.findOpinieById(id);
    }

    @DeleteMapping("/deleteById")
    public void deleteOpinieById(@RequestParam long opinieId) {
        opinieService.deleteOpinieById(opinieId);
    }

    @PostMapping
    public Opinie createOpinie(String opinie, String numeAutor, String prenumeAutor) {
        return opinieService.createOpinie(opinie, numeAutor, prenumeAutor);
    }

}