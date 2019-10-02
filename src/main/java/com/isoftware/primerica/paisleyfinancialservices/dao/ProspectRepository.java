package com.isoftware.primerica.paisleyfinancialservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isoftware.primerica.paisleyfinancialservices.entity.Prospect;

public interface ProspectRepository extends JpaRepository<Prospect, Integer> {

}