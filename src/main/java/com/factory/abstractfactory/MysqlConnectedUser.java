package com.factory.abstractfactory;

import java.util.Arrays;
import java.util.List;

/**
 * mysql用户连接信息类
 *
 * @author lance
 */
public class MysqlConnectedUser implements ConnectedUser
{
    @Override
    public List<String> getUserName()
    {
        return Arrays.asList("root", "fen", "james");
    }
}
