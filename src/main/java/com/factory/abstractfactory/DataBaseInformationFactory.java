package com.factory.abstractfactory;

/**
 * 数据库信息工厂类
 *
 * @author lance
 */
public interface DataBaseInformationFactory
{
    /**
     * 获取表空间
     *
     * @return
     */
    TableSpace getTableSpace();

    /**
     * 获取连接的用户信息
     *
     * @return
     */
    ConnectedUser getConnectedUsers();
}
