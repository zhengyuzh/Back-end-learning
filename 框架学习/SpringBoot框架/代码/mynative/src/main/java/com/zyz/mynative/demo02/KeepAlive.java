package com.zyz.mynative.demo02;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 11:05
 * @Description:
 */
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * 维持连接的消息对象（心跳对象）
 * @author zyz
 * @version 1.0
 * @data 2023/2/15 11:05
 * @Description:
 */
public class KeepAlive implements Serializable{

    private static final long serialVersionUID = -2813120366138988480L;

    /* 覆盖该方法，仅用于测试使用。
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"\t维持连接包";
    }

}