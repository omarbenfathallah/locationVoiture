package com.location.locationvoiture.Service;

import com.location.locationvoiture.Entity.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IVoitureService {
    List<Voiture> getVoituresParMarque(String nomMarque);

    List<Voiture> getVoitureParAnneeFabrication(int  annee);
}
