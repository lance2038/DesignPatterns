package com.singleton;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 单例测试
 *
 * @author lance
 */
public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        EnumSingle.INSTANCE.process();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(50), new NamedThreadFactory("HuoHuo"));

        for (int i = 0; i < 10; i++)
        {
            executor.execute(() ->
            {
                FullSingle single = FullSingle.getFullSingleInstance();
                single.process();
            });
        }

        for (int i = 0; i < 10; i++)
        {
            executor.execute(() ->
            {
                HungrySingle single = HungrySingle.getHungrySingleInstance();
                single.process();
            });
        }
        executor.shutdown();
    }
}

/**
 * 命名线程工厂
 */
class NamedThreadFactory implements ThreadFactory
{
    private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger threadNumber = new AtomicInteger(1);
    private final String namePrefix;

    NamedThreadFactory(String name)
    {

        SecurityManager s = System.getSecurityManager();
        group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
        if (null == name || name.isEmpty())
        {
            name = "pool";
        }

        namePrefix = name + "-" + POOL_NUMBER.getAndIncrement() + "-thread-";
    }

    @Override
    public Thread newThread(Runnable runnable)
    {
        Thread thread = new Thread(group, runnable, namePrefix + threadNumber.getAndIncrement(), 0);
        if (thread.isDaemon())
        {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != Thread.NORM_PRIORITY)
        {
            thread.setPriority(Thread.NORM_PRIORITY);
        }
        return thread;
    }
}
