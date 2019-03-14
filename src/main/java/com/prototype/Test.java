package com.prototype;

import java.io.IOException;

/**
 * 原型模式测试
 */
public class Test
{
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        // 序列化拷贝
        SampleModel sampleModel = new SampleModel(1, "wifi");
        System.out.println(sampleModel.toString());

        SampleModel cloneModel = CloneUtil.cloneBySerializable(sampleModel);
        if (null != cloneModel)
        {
            cloneModel.setId(2);
            System.out.println(cloneModel.toString());
        }

        // 反射拷贝
        SampleModel sourceModel = new SampleModel(1, "lan");
        System.out.println(sourceModel.toString());

        SampleModel targetModel = CloneUtil.cloneByReflex(sourceModel);
        if (null != targetModel)
        {
            targetModel.setId(2);
            System.out.println(targetModel.toString());
        }
    }
}
