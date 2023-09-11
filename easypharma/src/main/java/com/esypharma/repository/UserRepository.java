package com.esypharma.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.esypharma.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	Optional<User> findByUsername(String username);
	Boolean existsByEmail(String email);
	Boolean existsByUsername(String username);
	Optional<User> findById(String id);

	@Query("{ 'email' : ?0 }")
	Optional<User> findUserByEmailQuery(String email);

	/*
	 * //List<User> findAllByUserRolesName(String roleName);
	 * 
	 * //@Query(value = "{ 'roles': { $elemMatch: { 'name': ?0 } } }") //List<User>
	 * findUsersByRoleName(String roleName);
	 * 
	 * 
	 * @Query("{'roles.name': ?0}") List<User> findAllByRoleName(String roleName);
	 * 
	 * 
	 * 
	 * 
	 * @Query("{ 'roles.name': ?0 }") User findUsersByRoleName(String name);
	 * 
	 * 
	 * 
	 * 
	 * @Query(value = "{'role.roleName': 'user'}") List<User>
	 * findAllUsersWithRoleUser();
	 * 
	 * 
	 * 
	 */

}
