package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Avoir;
@Repository
public interface AvoirRepository extends JpaRepository<Avoir, Long>{

}