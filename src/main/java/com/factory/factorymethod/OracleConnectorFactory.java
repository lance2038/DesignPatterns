package com.factory.factorymethod;

/**
 * 4.oracle连接器工厂
 *
 * @author lance
 */
public class OracleConnectorFactory implements ConnectorFactory
{
    @Override
    public JdbcConnector getJdbcConnector()
    {
        return new OracleConnector();
    }
}
