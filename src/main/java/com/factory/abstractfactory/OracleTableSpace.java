package com.factory.abstractfactory;

/**
 * oracle表空间信息类
 *
 * @author lance
 */
public class OracleTableSpace implements TableSpace
{

    @Override
    public String getName()
    {
        return "oracle_db";
    }
}
