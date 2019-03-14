package com.strategy;

import java.util.Map;

/**
 * http请求工具类接口
 *
 * @author lance
 */
public interface IHttpUtils
{
    /**
     * 发送get请求
     *
     * @param url
     * @param params
     * @return
     */
    String getRequest(String url, Map params);
}
