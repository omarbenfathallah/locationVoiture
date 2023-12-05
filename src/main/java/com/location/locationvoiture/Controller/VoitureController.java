package com.location.locationvoiture.Controller;

import com.location.locationvoiture.Entity.Voiture;
import com.location.locationvoiture.Service.IVoitureService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    private final IVoitureService voitureService;

    public VoitureController(IVoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping("/voituresParMarque/{nomMarque}")
    public List<Voiture> getVoituresParMarque(@PathVariable String nomMarque) {
        return voitureService.getVoituresParMarque(nomMarque);
    }

    @GetMapping("/annee/{annee}")
    public List<Voiture> getVoituresParAnnee(@PathVariable int annee) {
        return voitureService.getVoitureParAnneeFabrication(annee);
    }

    @GetMapping("/model/{model}")
    public List<Voiture> getVoituresParModle(@PathVariable String model) {
        return voitureService.getVoituresParMarque(model);
    }
}
