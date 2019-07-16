package com.yin.controller;




import com.yin.helloserviceapi.entity.User;
import com.yin.helloserviceapi.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class RefactorController implements HelloService {

    private final Logger logger = LoggerFactory.getLogger(RefactorController.class);



    @Override
    public String hello(@RequestParam String name) {
        return "hello "+name;
    }

    @Override
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "hello "+ user.getName()+","+user.getAge()+"!";
    }
}
