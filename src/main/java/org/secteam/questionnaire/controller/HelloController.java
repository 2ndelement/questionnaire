package org.secteam.questionnaire.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 2ndElement
 * @version v1.0
 * @date 2022/11/19 22:25
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld() {
        return "index";
    }
}
