package com.factory.factorymethod;

import java.sql.Connection;

/**
 * 1.jdbc连接器
 *
 * @author lance
 */
public interface JdbcConnector
{
    /**
     * 获取数据库连接
     *
     * @return
     */
    Connection getConnection();
}
