package com.datong.dao;

import com.datong.common.C3p0Util;
import com.datong.entity.Sales;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class SalesDao {
    public List<Sales> query() throws SQLException {
        return C3p0Util.qr.query("select * from sales_ifo",new BeanListHandler<>(Sales.class));
    }
}