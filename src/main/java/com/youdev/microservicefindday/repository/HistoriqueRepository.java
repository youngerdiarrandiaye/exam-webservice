package com.youdev.microservicefindday.repository;

import com.youdev.microservicefindday.entities.Historique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoriqueRepository extends JpaRepository<Historique, Long> {
}
