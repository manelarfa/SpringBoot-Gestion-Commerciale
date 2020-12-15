package com.projet.stock.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.projet.stock.model.ConsCarburant;


@Repository
public interface ConsCarburantRepository extends JpaRepository<ConsCarburant, Long>{

	List<ConsCarburant> findByCode(int code_dir);
	
}