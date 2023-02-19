package com.zyz.mynative.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 9:35
 * @Description:　服务器接受心跳包返回的命令对象类：
 */
public class Cmder implements Serializable {

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
}
