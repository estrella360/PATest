package com.uisrael.test.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.uisrael.test.entity.Parent;

public interface IParentService {
	
	public void insertParent(Parent newParent);
	
	public List<Parent> listParents();
	
	public List<Parent> findParentByID(int parentID);
	
	public void deleteParentById(@Param("parentId")int parentId);

}
