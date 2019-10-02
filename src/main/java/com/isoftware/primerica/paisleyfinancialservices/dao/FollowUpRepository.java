package com.isoftware.primerica.paisleyfinancialservices.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.isoftware.primerica.paisleyfinancialservices.entity.FollowUp;

public interface FollowUpRepository extends JpaRepository<FollowUp, Integer> {

	FollowUp findFirstByOrderByNameAsc();
}