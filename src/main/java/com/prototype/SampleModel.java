package com.prototype;

import java.io.Serializable;

public class SampleModel implements Serializable
{
    private int id;
    private String name;

    public SampleModel()
    {
    }

    public SampleModel(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "SampleModel-" + this.hashCode() + "-{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
