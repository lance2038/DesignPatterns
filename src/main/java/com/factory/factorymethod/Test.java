package com.factory.factorymethod;

/**
 * 工厂方法测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        JdbcConnector mysqlConnector = new MysqlConnectorFactory().getJdbcConnector();
        JdbcConnector oracleConnector = new OracleConnectorFactory().getJdbcConnector();
        mysqlConnector.getConnection();
        oracleConnector.getConnection();
    }
}
