package com.factory.staticfactory;

import java.sql.Connection;

/**
 * 3.jdbc连接工厂
 *
 * @author lance
 */
public class JdbcFactory
{
    protected static final String MYSQL = "mysql";
    protected static final String ORACLE = "oracle";

    public static Connection getConnection(String dbName)
    {
        JdbcConnector connector = null;
        if (MYSQL.equals(dbName))
        {
            connector = new MysqlConnector();
        }
        else if (ORACLE.equals(dbName))
        {
            connector = new OracleConnector();
        }
        if (null != connector)
        {
            return connector.getConnection();
        }
        return null;
    }
}
