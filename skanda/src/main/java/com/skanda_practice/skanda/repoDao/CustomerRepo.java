package com.skanda_practice.skanda.repoDao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skanda_practice.skanda.dtoentity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	@Query("Select o from Customer o where o.name = :name")
	Optional<Customer> findByName(@Param("name") String name);

}
