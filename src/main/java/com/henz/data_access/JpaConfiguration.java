package com.henz.data_access;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfiguration {
	
	@Bean
	public StockJpaMapper stockJpaMapper() {
		return Mappers.getMapper(StockJpaMapper.class);
	}

}
