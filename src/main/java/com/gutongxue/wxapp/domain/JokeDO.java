package com.gutongxue.wxapp.domain;

import com.gutongxue.wxapp.util.GRQUtil;

public class JokeDO {
    private int id;
    private String openid;
    private String createTime;
    private String modifiedTime;
    private String content;
    private int source;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (!GRQUtil.checkNull(content)){
            content=content.replace("<p>","")
                    .replace("</p>","\n\r")
                    .replace("</br>","\n\r")
                    .replace("<br>","\n\r")
                    .replace("</ br>","\n\r")
                    .replace("&nbsp;"," ");
        }
        this.content = content;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        if (!GRQUtil.checkNull(createTime)){
            createTime=createTime.split("\\.")[0];
        }
        this.createTime = createTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        if (!GRQUtil.checkNull(modifiedTime)){
            modifiedTime=modifiedTime.split("\\.")[0];
        }
        this.modifiedTime = modifiedTime;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
