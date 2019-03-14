package com.observer;

/**
 * 通知模式测试
 */
public class Test
{
    public static void main(String[] args)
    {
        Sentinel sentinel = new Sentinel();
        ReportServer report = new ReportServer("报表服务器");
        SchedulerServer scheduler = new SchedulerServer("任务服务器");

        // 注册observer
        sentinel.registerObserver(report);
        sentinel.registerObserver(scheduler);

        // ping通redis通知所有服务器可以使用redis
        sentinel.notifyObservers();
    }
}
