package com.factory.abstractfactory;

/**
 * mysql表空间信息类
 *
 * @author lance
 */
public class MysqlTableSpace implements TableSpace
{

    @Override
    public String getName()
    {
        return "mysql_db";
    }
}
