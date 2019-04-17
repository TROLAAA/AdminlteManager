package com.datong.dao;

import com.datong.common.C3p0Util;
import com.datong.entity.Stock;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StockDao {
    public List<Stock> query() throws SQLException {
        return C3p0Util.qr.query("select * from goods_ifo",new BeanListHandler<>(Stock.class));
    }
}