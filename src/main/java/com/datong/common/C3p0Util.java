package com.datong.common;

        import com.mchange.v2.c3p0.ComboPooledDataSource;
        import org.apache.commons.dbutils.QueryRunner;

public class C3p0Util {
    public static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

    public static QueryRunner qr = new QueryRunner(comboPooledDataSource);
}
