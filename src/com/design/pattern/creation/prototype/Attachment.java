package com.design.pattern.creation.prototype;

import static java.lang.System.out;

public class Attachment {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download(){
        out.println("下载附件： "+name);
    }
}
