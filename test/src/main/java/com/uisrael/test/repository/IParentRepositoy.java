package com.uisrael.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.uisrael.test.entity.Parent;

@Repository
@Component
public interface IParentRepositoy extends JpaRepository<Parent, Integer>{
	
	@Query("Select p from Parent p where p.parentId=?1")
	public List<Parent> findParentByID (int parentId);
	
	@Query("Select p from Parent p where p.parentStatus = ?1")
	public List<Parent> findParentByStatus(int status);
	
	@Query("UPDATE Parent p SET p.parentStatus = false WHERE p.parentId - :parentId")
	public void deleteParentById(@Param("idParent")int parentId);

}
