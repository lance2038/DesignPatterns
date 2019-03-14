package com.factory.factorymethod;


/**
 * 3.连接器工厂
 *
 * @author lance
 */
public interface ConnectorFactory
{
    /**
     * 获取jdbc连接器
     *
     * @return
     */
    JdbcConnector getJdbcConnector();
}
