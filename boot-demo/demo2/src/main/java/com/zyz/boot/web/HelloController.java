package com.zyz.boot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zyz
 * @version 1.0
 * @data 2023/8/28 10:51
 * @Description:
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(ModelMap map) {
        // 添加一个属性,用来在模板中根据这个key来读取对应的值
        map.addAttribute("msg", "Hello SpringBoot Thymeleaf");
        // return 模板文件的名称-->对应src/main/resources/templates/index.html
        return "index";
    }


}
