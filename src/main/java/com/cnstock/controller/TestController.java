package com.cnstock.controller;

import com.cnstock.enity.AppEntity;
import com.cnstock.service.IApplicationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/3/13.
 */

@Controller("testController")
public class TestController {

    Logger logger = Logger.getLogger(getClass());

    @Autowired
    IApplicationService applicationService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        logger.info("==========index=======");
        return "index";
    }


    @ResponseBody
    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<AppEntity> getAll(){
        logger.info("=========getAll App=========");
        return applicationService.findAll();
    }

}
