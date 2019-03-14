package com.factory.abstractfactory;

/**
 * oracle数据库信息工厂类
 *
 * @author lance
 */
public class OracleInformationFactory implements DataBaseInformationFactory
{
    @Override
    public TableSpace getTableSpace()
    {
        return new OracleTableSpace();
    }

    @Override
    public ConnectedUser getConnectedUsers()
    {
        return new OracleConnectedUser();
    }
}
