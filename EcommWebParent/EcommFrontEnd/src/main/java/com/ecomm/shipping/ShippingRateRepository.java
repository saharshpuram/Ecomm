package com.ecomm.shipping;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.common.entity.Country;
import com.ecomm.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
