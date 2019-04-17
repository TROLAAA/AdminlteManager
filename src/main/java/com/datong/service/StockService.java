package com.datong.service;

import com.datong.dao.StockDao;
import com.datong.entity.Stock;

import java.sql.SQLException;
import java.util.List;

public class StockService {

    private StockDao stockDao = new StockDao();

    public List<Stock> query() throws SQLException {
        return stockDao.query();
    }
}
