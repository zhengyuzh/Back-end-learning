package com.zyz.demo2;

import java.util.Hashtable;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/22 12:20
 * @Description:
 */

//坐标类：外部状态类

class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//围棋棋子类：抽象享元类

abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );
    }
}



//黑色棋子类：具体享元类

class BlackIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
        return "黑色";
    }
}


//白色棋子类：具体享元类

class WhiteIgoChessman extends IgoChessman{

    @Override
    public String getColor() {
        return "白色";
    }
}


//围棋棋子工厂类：享元工厂类，使用单例模式进行设计

class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池


    private IgoChessmanFactory(){
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }

    /**
     * 返回享元工厂类的唯一实例
     * @return
     */
    public static IgoChessmanFactory getInstance(){
        return instance;
    }

    /**
     * 通过key来获取存储在Hashtable中的享元对象
     * @param color
     * @return
     */
    public  IgoChessman getIgoChessman(String color){
        return (IgoChessman) ht.get(color);
    }
}