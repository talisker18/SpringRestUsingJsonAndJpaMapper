package com.henz.data_access;

import org.mapstruct.Mapper;

@Mapper
public interface StockJpaMapper {
	Stock toEntity(com.henz.dto.Stock stock); //get dto and return entity, e.g. when saving in DB
	com.henz.dto.Stock toDto(Stock stock); //get an entity from DB and return dto
}
