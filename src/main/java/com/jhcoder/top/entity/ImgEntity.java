package com.jhcoder.top.entity;

import java.util.Date;

public class ImgEntity {
    private String id;

    private String name;

    private String path;

    private String fullpath;

    private Long size;

    private String ip;

    private Date creat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFullpath() {
        return fullpath;
    }

    public void setFullpath(String fullpath) {
        this.fullpath = fullpath;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreat() {
        return creat;
    }

    public void setCreat(Date creat) {
        this.creat = creat;
    }
}