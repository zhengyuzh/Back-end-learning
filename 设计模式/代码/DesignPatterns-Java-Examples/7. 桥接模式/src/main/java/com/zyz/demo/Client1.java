package com.zyz.demo;

import com.zyz.demo.config.XMLUtil;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/5/13 21:47
 * @Description: 客户端
 */
public class Client1 {
    public static void main(String[] args) {
        Image image;
        ImageImp imp;
        image = (Image)XMLUtil.getBean("image");
        imp = (ImageImp) XMLUtil.getBean("os");
        image.setImageImp(imp);
        image.parseFile("杨过");
    }
}
