package com.factory.abstractfactory;

/**
 * mysql数据库信息工厂类
 *
 * @author lance
 */
public class MysqlInformationFactory implements DataBaseInformationFactory
{
    @Override
    public TableSpace getTableSpace()
    {
        return new MysqlTableSpace();
    }

    @Override
    public ConnectedUser getConnectedUsers()
    {
        return new MysqlConnectedUser();
    }
}
