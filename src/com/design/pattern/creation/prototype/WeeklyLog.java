package com.design.pattern.creation.prototype;

public class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;

    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // 1.实现Cloneable接口
    // 2.调用super.clone()方法并声明为public
    public WeeklyLog clone(){
        Object object = null;
        try {
            object =  super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
