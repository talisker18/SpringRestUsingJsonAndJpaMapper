package com.henz.data_access;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.henz.dto.Stock;

@Repository
@Qualifier("jpa")
public class StockJpaDao implements StockDao{
	
	@Resource
	private StockJpaRepository stockJpaRepository;
	
	@Resource
	private StockJpaMapper stockJpaMapper;

	@Override
	public com.henz.dto.Stock findById(String id) {
		return this.stockJpaRepository.findByNameIgnoreCaseStartingWith(id)
				.map(stockEntity -> this.stockJpaMapper.toDto(stockEntity))
				.orElse(null);
	}

	@Override
	@Transactional
	public void save(Stock stock) {
		this.stockJpaRepository.save(this.stockJpaMapper.toEntity(stock));
	}

}
