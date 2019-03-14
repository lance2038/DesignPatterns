package com.factory.abstractfactory;

import java.util.List;

/**
 * 数据库连接用户信息接口类
 *
 * @author lance
 */
public interface ConnectedUser
{
    /**
     * 获取用户名称
     *
     * @return
     */
    List<String> getUserName();
}
