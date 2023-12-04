package com.location.locationvoiture.Repository;

import com.location.locationvoiture.Entity.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface VoitureRepository  extends JpaRepository<Voiture, Long> {
    List<Voiture> findByMarque(String marque);
}
