package com.proxy.dynamicbyjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理网络工厂
 *
 * @author lance
 */
public class NetWorkProxyFactory
{
    /**
     * 需要代理的对象
     */
    private Object target;

    public NetWorkProxyFactory(Object target)
    {
        this.target = target;
    }

    /**
     * 给目标对象生成代理对象
     *
     * @return
     */
    public Object getProxyInstance()
    {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                //执行目标对象方法
                System.out.println("start proxy");
                return method.invoke(target, args);
            }
        });
    }
}
