package com.ecomm.setting;

import org.springframework.data.repository.CrudRepository;

import com.ecomm.common.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
