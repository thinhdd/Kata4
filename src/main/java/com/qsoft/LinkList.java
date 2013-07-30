package com.qsoft;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.List;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 7/29/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkList
{
    List<Model> modelList= new ArrayList<Model>();

    public LinkList(List<Model> modelList)
    {
        this.modelList = modelList;
    }

    public LinkList()
    {
    }

    public int size()
    {
        return modelList.size();
    }

    public void doAppend(Model model)
    {
        modelList.add(modelList.size(), model);
    }

    public Model getNode(int index)
    {

        System.out.println(modelList.size());
        return modelList.get(modelList.size()-1);
    }
}
