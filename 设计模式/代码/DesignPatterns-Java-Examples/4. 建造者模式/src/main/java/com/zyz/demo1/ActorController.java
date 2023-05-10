package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/10 13:57
 * @Description: 游戏角色创建控制器：指挥者
 */
public class ActorController {
    //逐步构建复杂产品对象

    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }

}
