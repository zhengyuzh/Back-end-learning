package com.zyz.mynative;

import com.zyz.mynative.controller.HeartbeatClient;
import com.zyz.mynative.service.HeartbeatHandler;
import com.zyz.mynative.service.ServiceCenter;
import com.zyz.mynative.service.serviceImol.HeartbeatHandlerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class MynativeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testHeartbeatTest(){
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServiceCenter serviceServer = ServiceCenter.getInstance();
                    serviceServer.register(HeartbeatHandler.class, HeartbeatHandlerImpl.class);
                    serviceServer.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        Thread client1 = new Thread(new HeartbeatClient());
        client1.start();
        Thread client2 = new Thread(new HeartbeatClient());
        client2.start();
    }

}
