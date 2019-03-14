package com.prototype;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 克隆工具类
 *
 * @author lance
 */
@SuppressWarnings("unchecked")
public class CloneUtil
{
    /**
     * 使用序列化克隆,慢！与反射不是一个等级的,建议用反射，此仅用于demo
     *
     * @param t
     * @param <T>
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static <T> T cloneBySerializable(T t) throws IOException, ClassNotFoundException
    {
        Long bgn = System.nanoTime();
        // 序列化
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        oos.writeObject(t);

        // 反序列化
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        Long end = System.nanoTime();
        System.out.println("cloneBySerializable:" + (end - bgn));
        return (T) ois.readObject();
    }

    /**
     * 反射克隆
     *
     * @param source
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T> T cloneByReflex(T source) throws IllegalAccessException, InstantiationException
    {
        Long bgn = System.nanoTime();
        // 要克隆的类
        Class cls = source.getClass();
        // 创建一个信的待拷贝实例
        T target = (T) cls.newInstance();

        Field[] sourceFields = cls.getDeclaredFields();
        Field[] targetFields = cls.getDeclaredFields();

        if (sourceFields.length == 0)
        {
            return null;
        }

        for (Field sourceField : sourceFields)
        {
            sourceField.setAccessible(true);
            for (Field targetField : targetFields)
            {
                if (Modifier.isFinal(targetField.getModifiers()))
                {
                    continue;
                }
                targetField.setAccessible(true);
                if (targetField.getType().isAssignableFrom(sourceField.getType()) && sourceField.getName().equals(targetField.getName()))
                {
                    targetField.set(target, sourceField.get(source));
                }
            }
        }
        Long end = System.nanoTime();
        System.out.println("cloneBySerializable:" + (end - bgn));

        return target;
    }
}
