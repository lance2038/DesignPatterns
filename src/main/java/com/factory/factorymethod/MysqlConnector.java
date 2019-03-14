package com.factory.factorymethod;

import java.sql.Connection;

/**
 * 2.mysql连接器
 *
 * @author lance
 */
public class MysqlConnector implements JdbcConnector
{
    @Override
    public Connection getConnection()
    {
        System.out.println("连接mysql");
        return null;
    }
}
