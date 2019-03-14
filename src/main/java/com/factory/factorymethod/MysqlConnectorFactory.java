package com.factory.factorymethod;

/**
 * 4.mysql连接器工厂
 *
 * @author lance
 */
public class MysqlConnectorFactory implements ConnectorFactory
{
    @Override
    public JdbcConnector getJdbcConnector()
    {
        return new MysqlConnector();
    }
}
