package br.com.suaempresa.repository;

import br.com.suaempresa.model.Activitie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivitieRepository extends JpaRepository<Activitie, Long> {
}
