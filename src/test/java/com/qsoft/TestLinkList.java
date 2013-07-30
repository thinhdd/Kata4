package com.qsoft;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 7/29/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestLinkList
{
    List<Model> list = new ArrayList<Model>();
    LinkList linkList;
    @Before
    public void setUp(){
        list.add(new Model("123"));
        list.add(new Model("234"));
        list.add(new Model("142"));
        linkList = new LinkList(list);
    }
    @Test
    public void testSizeEmpty()
    {
        LinkList linkList = new LinkList();
        assertTrue(linkList.size()==0);
    }
    @Test
    public void testSize()
    {
        assertTrue(linkList.size()==3);
    }

    @Test
    public void testAppendList()
    {
        Model model = new Model("4444");
        linkList.doAppend(model);
        assertTrue(linkList.size()==4);
    }
    @Test
    public void testGetNode()
    {
        Model model = new Model("444");
        linkList.doAppend(model);
        Model reModel = linkList.getNode(2);
        System.out.println(model);
        System.out.println(reModel);
    }
}
