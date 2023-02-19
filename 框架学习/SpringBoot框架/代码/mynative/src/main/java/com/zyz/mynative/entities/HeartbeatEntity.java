package com.zyz.mynative.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 9:33
 * @Description:  心跳包实体类：
 */
public class HeartbeatEntity implements Serializable {

    private long time;
    private String nodeID;
    private String error;
    private Map<String, Object> info = new HashMap<String, Object>();

    public String getNodeID() {
        return nodeID;
    }

    public void setNodeID(String nodeID) {
        this.nodeID = nodeID;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
