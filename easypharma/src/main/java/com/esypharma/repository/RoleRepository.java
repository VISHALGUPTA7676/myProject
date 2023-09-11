package com.esypharma.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.esypharma.models.ERole;
import com.esypharma.models.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	Optional<Role> findByName(ERole name);

}
