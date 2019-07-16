package com.yin.helloserviceapi.service;


import com.yin.helloserviceapi.entity.User;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "refactor")
public interface HelloService {


    @RequestMapping(value = "/hello4",method = RequestMethod.GET)
    String hello(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/hello5",method = RequestMethod.GET)
    User hello(@RequestHeader(value = "name") String name, @RequestHeader(value = "age") Integer age);

    @RequestMapping(value = "/hello6",method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
