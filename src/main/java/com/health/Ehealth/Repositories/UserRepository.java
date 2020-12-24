package com.health.Ehealth.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.health.Ehealth.Entities.Joueur;

@Service
public interface UserRepository extends JpaRepository<Joueur,Integer> {

}
