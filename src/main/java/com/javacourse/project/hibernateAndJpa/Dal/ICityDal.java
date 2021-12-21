package com.javacourse.project.hibernateAndJpa.Dal;
import java.util.List;

import  com.javacourse.project.hibernateAndJpa.Entities.*;

public interface ICityDal {
	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
