package com.zyz.mynative.service;

import com.zyz.mynative.controller.Cmder;
import com.zyz.mynative.entities.HeartbeatEntity;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 9:40
 * @Description:
 */
public interface HeartbeatHandler {
    public Cmder sendHeartBeat(HeartbeatEntity info);
}
