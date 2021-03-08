package model.dao;

import java.util.List;

import model.entities.Sellert;

public interface DepartmentDAO {

	void insert(Sellert obj);
	
	void update(Sellert obj);
	
	void deleteById(Integer id);
	
	Sellert findById(Integer id);
	
	List<Sellert> findAll();
}
