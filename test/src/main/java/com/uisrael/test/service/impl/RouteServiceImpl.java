package com.uisrael.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.test.entity.Route;
import com.uisrael.test.repository.IRouteRepository;
import com.uisrael.test.service.IRouteService;

@Service
@Component
public class RouteServiceImpl implements IRouteService {
	
	@Autowired
	private IRouteRepository repository;

	@Override
	public void insertRoute(Route nuevoRoute) {
		try {
			repository.save(nuevoRoute);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<Route> listRoute() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Route> findRouteByID(int id) {
		// TODO Auto-generated method stub
		return repository.findRouteById(id);
		//return null;
	}

	@Override
	public List<Route> listRoute1() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteRouteById(int id) {
		// TODO Auto-generated method stub
		try {
			repository.deleteRouteById(int id);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	

}
