package com.location.locationvoiture.Controller;

import com.location.locationvoiture.Entity.Voiture;
import com.location.locationvoiture.Service.IVoitureService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    @Autowired
    private IVoitureService voitureService;

    @GetMapping("/voituresParMarque")
    public List<Voiture> getVoituresParMarque(@RequestParam String nomMarque) {
        return voitureService.getVoituresParMarque(nomMarque);
    }

    @GetMapping("/voituresParMarque")
    public List<Voiture> getVoituresParAnnee(@RequestParam int annee) {
        return voitureService.getVoitureParAnneeFabrication(annee);
    }

    @GetMapping("/voituresParMarque")
    public List<Voiture> getVoituresParModle(@RequestParam String model) {
        return voitureService.getVoituresParMarque(model);
    }
}
