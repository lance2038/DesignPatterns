package com.factory.abstractfactory;

import java.util.List;

/**
 * 抽象工厂测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args)
    {
        DataBaseInformationFactory factory = new OracleInformationFactory();
        String nameSpace = factory.getTableSpace().getName();
        System.out.println(nameSpace);
        List users = factory.getConnectedUsers().getUserName();
        System.out.println(users);
    }
}
