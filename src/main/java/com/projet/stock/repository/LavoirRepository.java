package com.projet.stock.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projet.stock.model.Lavoir;
@Repository
public interface LavoirRepository extends JpaRepository<Lavoir, Long>{

}
