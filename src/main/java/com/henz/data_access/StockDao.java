package com.henz.data_access;

import com.henz.dto.Stock;

public interface StockDao {
	
	Stock findById(String id);
	void save(Stock stock);

}
