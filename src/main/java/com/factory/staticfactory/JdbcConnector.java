package com.factory.staticfactory;

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
