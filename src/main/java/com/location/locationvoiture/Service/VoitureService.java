package com.location.locationvoiture.Service;

import com.location.locationvoiture.Entity.Voiture;
import com.location.locationvoiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoitureService  implements IVoitureService {

    @Autowired
    private VoitureRepository voitureRepository;


    @Override
    public List<Voiture> getVoituresParMarque(String nomMarque) {
        return voitureRepository.findByMarque(nomMarque);
    }

    @Override
    public List<Voiture> getVoitureParAnneeFabrication(int annee) {
        return voitureRepository.findByAnneeFabrication(annee);
    }

    @Override
    public List<Voiture> getVoitureByModel(String model) {
        return voitureRepository.findByModele(model);
    }
}
