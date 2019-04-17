package com.datong.service;

import com.datong.dao.SalesDao;
import com.datong.entity.Sales;

import java.sql.SQLException;
import java.util.List;

public class SalesService {

    private SalesDao salesDao = new SalesDao();

    public List<Sales> query() throws SQLException {
        return salesDao.query();
    }
}