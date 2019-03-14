package com.delegate;

public class Test
{
    public static void main(String[] args)
    {
        TaskDispatcher taskDispatcher = new TaskDispatcher();
        taskDispatcher.doBusiness(TaskDispatcher.SEND_FILE);
        taskDispatcher.doBusiness(TaskDispatcher.SAVE_LOG);
    }
}
