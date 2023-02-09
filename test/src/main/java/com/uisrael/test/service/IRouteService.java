package com.uisrael.test.service;

import java.util.List;

import com.uisrael.test.entity.Route;

public interface IRouteService {
	
	public void insertRoute(Route newRoute);
	
	public List<Route> listRoute();
	
	public List<Route> findRouteByID(int id);
	
	public void deleteRouteById(int id);

}
