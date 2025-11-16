package com.skanda_practice.skanda.repoDao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skanda_practice.skanda.dtoentity.PracticeEntiry;

@Repository
public interface PracticeRepo extends JpaRepository<PracticeEntiry, Long> {
	
	@Query("SELECT o FROM PracticeEntiry o WHERE o.customerName = :customerName")
    List<PracticeEntiry> findOrdersByCustomerName(@Param("customerName")String customerName);

}
