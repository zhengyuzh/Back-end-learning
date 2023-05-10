package com.zyz.demo1;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/10 13:43
 * @Description: 角色建造器：抽象建造者
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

//工厂方法，返回一个完整的游戏角色对象

    public Actor createActor() {
        return actor;
    }

}
