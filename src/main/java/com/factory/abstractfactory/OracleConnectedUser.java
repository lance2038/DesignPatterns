package com.factory.abstractfactory;

import java.util.Arrays;
import java.util.List;

/**
 * oracle用户连接信息类
 *
 * @author lance
 */
public class OracleConnectedUser implements ConnectedUser
{
    @Override
    public List<String> getUserName()
    {
        return Arrays.asList("sys", "jak", "tom");
    }
}
