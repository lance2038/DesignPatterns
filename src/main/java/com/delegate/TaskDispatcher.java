package com.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * 任务派发器
 *
 * @author lance
 */
public class TaskDispatcher implements DealBusiness
{
    public static final String SEND_FILE = "send_file";
    public static final String SAVE_LOG = "save_log";
    private static Map<String, DealBusiness> tasks = new HashMap<>();

    static
    {
        tasks.put(SEND_FILE, new FileSender());
        tasks.put(SAVE_LOG, new LogRecorder());
    }

    @Override
    public void doBusiness(String command)
    {
        tasks.get(command).doBusiness(command);
    }
}
