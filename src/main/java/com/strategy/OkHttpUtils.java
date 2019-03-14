package com.strategy;

import java.util.Map;

/**
 * 使用okHttp
 *
 * @author lance
 */
public class OkHttpUtils implements IHttpUtils
{
    /**
     * 发送get请求
     *
     * @param url
     * @param params
     * @return
     */
    @Override
    public String getRequest(String url, Map params)
    {
        // 使用okHttp请求
        return "OkHttpResponse";
    }
}
