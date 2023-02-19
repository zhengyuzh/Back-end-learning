package com.zyz.mynative.service.serviceImol;

import com.zyz.mynative.controller.Cmder;
import com.zyz.mynative.entities.HeartbeatEntity;
import com.zyz.mynative.service.HeartbeatHandler;
import com.zyz.mynative.service.HeartbeatLinstener;

import java.util.Map;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 9:40
 * @Description:
 */
public class HeartbeatHandlerImpl implements HeartbeatHandler {
    @Override
    public Cmder sendHeartBeat(HeartbeatEntity info) {
        HeartbeatLinstener linstener = HeartbeatLinstener.getInstance();

        // 添加节点
        if (!linstener.checkNodeValid(info.getNodeID())) {
            linstener.registerNode(info.getNodeID(), info);
        }

        // 其他操作
        Cmder cmder = new Cmder();
        cmder.setNodeID(info.getNodeID());
        // ...

        System.out.println("current all the nodes: ");
        Map<String, Object> nodes = linstener.getNodes();
        for (Map.Entry e : nodes.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println("hadle a heartbeat");
        return cmder;
    }
}
