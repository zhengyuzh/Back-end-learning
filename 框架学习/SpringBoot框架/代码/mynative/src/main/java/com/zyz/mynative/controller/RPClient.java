package com.zyz.mynative.controller;

import com.zyz.mynative.service.HeartbeatHandler;

import java.net.InetSocketAddress;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 10:09
 * @Description:
 */
public class RPClient {
    public static HeartbeatHandler getRemoteProxyObj(Class<HeartbeatHandler> heartbeatHandlerClass, InetSocketAddress inetSocketAddress) {
        HeartbeatHandler handler = null;
        return  handler;
    }
}
