package com.yin.controller;



import com.yin.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public String index() {
        return "hello world!";
    }

    @RequestMapping(value = "/hello1", method= RequestMethod.GET)
    public String index(@RequestParam String name) {
        return "hello "+name;
    }

    @RequestMapping(value = "/hello2", method= RequestMethod.GET)
    public User index(@RequestHeader String name,@RequestHeader Integer age) {
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method= RequestMethod.POST)
    public String index(@RequestBody User user) {
        return "hello "+ user.getName()+","+user.getAge()+"!";
    }
}
