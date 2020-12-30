package com.health.Ehealth.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;

public interface CoachRepository extends JpaRepository<Coach, Long>{

}
