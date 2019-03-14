package com.factory.factorymethod;

import java.sql.Connection;

/**
 * 2.oracle连接器
 *
 * @author lance
 */
public class OracleConnector implements JdbcConnector
{
    @Override
    public Connection getConnection()
    {
        System.out.println("连接oracle");
        return null;
    }
}
