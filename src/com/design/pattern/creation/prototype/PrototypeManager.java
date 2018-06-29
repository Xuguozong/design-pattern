package com.design.pattern.creation.prototype;

import java.util.Hashtable;
// 原型管理器，使用饿汉式单例
public class PrototypeManager {
    // hashtable用于存放原型
    private Hashtable<String, OfficeDocument> hs = new Hashtable<>();

    private static PrototypeManager manager = new PrototypeManager();

    public void addOfficeDocument(String key, OfficeDocument document){
        hs.put(key,document);
    }

    private PrototypeManager(){
        hs.put("far", new FAR());
        hs.put("srs", new SRS());
    }

    // 通过浅克隆获取新的公文对象
    public OfficeDocument getOfficeDocument(String key){
        return hs.get(key).clone();
    }

    public static PrototypeManager getManager(){
        return manager;
    }

}
