package com.uisrael.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uisrael.test.entity.Route;

@Repository
@Component
public interface IRouteRepository extends JpaRepository<Route, Integer> {
	
	@Query("Select r From Route r where r.routeId = ?1")
	public Route findRouteById(int id);
	
	@Query("UPDATE Route r SET r.routeStatus = false WHERE r.routeId = :routeId")
	public void deleteRouteById(@Param("routeId") int route);
	
	
	
	
	

}
