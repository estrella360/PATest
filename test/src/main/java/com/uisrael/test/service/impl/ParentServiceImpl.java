package com.uisrael.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.test.entity.Parent;
import com.uisrael.test.repository.IParentRepositoy;
import com.uisrael.test.service.IParentService;


@Service
@Component
public class ParentServiceImpl implements IParentService {

	@Autowired
	private IParentRepositoy repositoy;

	@Override
	public void insertParent(Parent newParent) {
		try {
			repositoy.save(newParent);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public List<Parent> listParents() {
		// TODO Auto-generated method stub
		return repositoy.findAll();
	}


	@Override
	public Parent findParentByID(int parentId) {
		// TODO Auto-generated method stub
		return (Parent) repositoy.findParentById(parentId);
		
	}

	@Override
	public void deleteParentById(int parentId) {
		// TODO Auto-generated method stub
		repositoy.deleteParentById(parentId);
		
	}
}
