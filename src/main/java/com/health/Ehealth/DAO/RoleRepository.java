package com.health.Ehealth.DAO;
import java.util.Optional;
import com.health.Ehealth.modal.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(ERole name);
}