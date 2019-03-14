package com.factory.staticfactory;

import java.sql.Connection;

import static com.factory.staticfactory.JdbcFactory.MYSQL;
import static com.factory.staticfactory.JdbcFactory.ORACLE;

/**
 * 静态工厂测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        Connection master = JdbcFactory.getConnection(MYSQL);
        Connection salver = JdbcFactory.getConnection(ORACLE);
    }
}
