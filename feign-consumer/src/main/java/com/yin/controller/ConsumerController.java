package com.yin.controller;


import com.yin.entity.User;
import com.yin.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

//    @Autowired
//    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

//    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
//    public String helloConsumer(){
//        return helloService.hello();
//    }

//    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
//    public String helloConsumer2() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(helloService.hello()).append("\n");
//        sb.append(helloService.hello("DIDI")).append("\n");
//        sb.append(helloService.hello("DIDI", 30)).append("\n");
//        sb.append(helloService.hello(new User("DIDI", 30))).append("\n");
//        return sb.toString();
//    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(refactorHelloService.hello("MIMI")).append("\n");
        sb.append(refactorHelloService.hello("MIMI", 30)).append("\n");
        sb.append(refactorHelloService.hello(new com.yin.helloserviceapi.entity.User("MIMI", 30))).append("\n");
        return sb.toString();
    }
}
