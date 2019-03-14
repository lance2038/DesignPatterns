package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 网络代理工厂
 *
 * @author lance
 */
public class NetWorkProxyFactory implements MethodInterceptor
{
    /**
     * 需要代理的对象
     */
    private Object target;

    public NetWorkProxyFactory(Object target)
    {
        this.target = target;
    }

    public Object getProxyInstance()
    {
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable
    {
        System.out.println("start proxy");
        //执行目标对象的方法
        return method.invoke(target, args);
    }
}
