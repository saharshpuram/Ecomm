package com.ecomm.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.common.entity.Country;
import com.ecomm.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
