package com.loteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loteria.entity.Numero;

@Repository
public interface NumeroRepository extends JpaRepository  <Numero, Long> {
		List<Numero> findByEmail(String email);
		
		 
		 
}
