package com.henz.data_access;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface StockJpaRepository extends CrudRepository<Stock, String>{
	Optional<Stock> findByNameIgnoreCaseStartingWith(String name);
}
