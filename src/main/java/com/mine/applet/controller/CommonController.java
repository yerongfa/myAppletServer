package com.mine.applet.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yrf
 * @date 2019/2/14 16:34
 */
@RestController
@RequestMapping("common")
public class CommonController {

    @GetMapping("login")
    public String login() {
        return "ok";
    }

}
