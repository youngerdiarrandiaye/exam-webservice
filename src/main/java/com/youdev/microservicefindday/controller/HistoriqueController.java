package com.youdev.microservicefindday.controller;

import com.youdev.microservicefindday.entities.Historique;
import com.youdev.microservicefindday.repository.HistoriqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class HistoriqueController {

    @Autowired
    private HistoriqueRepository historiqueRepository;

    @GetMapping("/services/historique/all")
    public List<Historique> getAllHistorique() {
        return historiqueRepository.findAll();
    }
}
